/*
 * Copyright (c) 1990-2012 kopiLeft Development SARL
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * $Id:$
 */

package org.kopi.ebics.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.kopi.ebics.client.FileTransfer;
import org.kopi.ebics.exception.EbicsException;
import org.kopi.ebics.interfaces.PasswordCallback;
import org.kopi.ebics.messages.Messages;
import org.kopi.ebics.security.UserPasswordHandler;
import org.kopi.ebics.session.EbicsSession;
import org.kopi.ebics.session.OrderType;
import org.kopi.ebics.session.Product;
import org.kopi.ebics.utils.Constants;

public class FDLRequestor extends EbicsClient {
  
  public FDLRequestor() {
    super();
  }
  
  public void fetchFile(String path, 
                        String userId, 
                        Product product,
                        OrderType orderType,
                        boolean isTest,
                        Date start,
                        Date end) 
  {
    FileTransfer                transferManager;
    EbicsSession                session;

    session = new EbicsSession(users.get(userId), configuration);
    session.addSessionParam("FORMAT", "pain.xxx.cfonb160.dct");
    if (isTest) {
      session.addSessionParam("TEST", "true");
    }
    session.setProduct(product);
    transferManager = new FileTransfer(session);

    configuration.getTraceManager().setTraceDirectory(configuration.getTransferTraceDirectory(users.get(userId)));

    try {
      transferManager.fetchFile(orderType, start, end, new FileOutputStream(path));
    } catch (IOException e) {
      configuration.getLogger().error(Messages.getString("download.file.error",
                                                         Constants.APPLICATION_BUNDLE_NAME),
                                      e);
    } catch (EbicsException e) {
      configuration.getLogger().error(Messages.getString("download.file.error",
                                                         Constants.APPLICATION_BUNDLE_NAME),
                                      e);
    }
}
  
  public static void main(String[] args) throws Exception {
    String      hostId = "";
    String      partnerId = "";
    String      userId = "";
    
    CommandLineParser parser = new BasicParser();
    Options options = new Options();
    options.addOption("h", "host", true, "EBICS Host ID");
    options.addOption("p", "partner", true, "Registred Partner ID for you user");
    options.addOption("u", "user", true, "User ID to initiate" );
    
    // Parse the program arguments
    CommandLine commandLine = parser.parse(options, args);
    
    if (!commandLine.hasOption('h')) {
      System.out.println("Host-ID is mandatory");
      System.exit(0);
    } else {
      hostId = commandLine.getOptionValue('h');
      System.out.println("host: " + hostId);
    }
    
    if (!commandLine.hasOption('p')) {
      System.out.println("Partner-ID is mandatory");
      System.exit(0);
    } else {
      partnerId = commandLine.getOptionValue('p');
      System.out.println("partnerId: " + partnerId);
    }
    
    if (!commandLine.hasOption('u')) {
      System.out.println("User-ID is mandatory");
      System.exit(0);
    } else {
      userId = commandLine.getOptionValue('u');
      System.out.println("userId: " + userId);
    }
    
    FDLRequestor        fdlRequestor;
    PasswordCallback    pwdHandler;
    Product             product;
    String              filePath;
    
    fdlRequestor = new FDLRequestor();
    product = new Product("kopiLeft Dev 1.0", Locale.FRANCE, null);
    pwdHandler = new UserPasswordHandler(userId, "2012");
    
    // Load alredy created user
    fdlRequestor.loadUser(hostId, partnerId, userId, pwdHandler);
    
    filePath = System.getProperty("user.home") + File.separator + "download.txt";
    
    // Send FDL Requets
    fdlRequestor.fetchFile(filePath, 
                           userId, 
                           product, 
                           OrderType.FDL, 
                           true, 
                           null, 
                           null);
  }

}
