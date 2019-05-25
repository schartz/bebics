/*
 *
 *
 * $Id: HttpRequestSender.java 9 2019-05-21 08:51:15Z schartz $
 */

package com.github.schartz.bebics.client;

import java.io.IOException;
import java.io.InputStream;

import com.github.schartz.bebics.interfaces.ContentFactory;
import com.github.schartz.bebics.io.InputStreamContentFactory;
import com.github.schartz.bebics.session.EbicsSession;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;


/**
 * A simple HTTP request sender and receiver.
 * The send returns a HTTP code that should be analyzed
 * before proceeding ebics request response parse.
 *
 * @author schartz
 *
 */
public class HttpRequestSender {

  /**
   * Constructs a new <code>HttpRequestSender</code> with a
   * given ebics session.
   * @param session the ebics session
   */
  public HttpRequestSender(EbicsSession session) {
    this.session = session;
  }

  /**
   * Sends the request contained in the <code>ContentFactory</code>.
   * The <code>ContentFactory</code> will deliver the request as
   * an <code>InputStream</code>.
   *
   * @param request the ebics request
   * @return the HTTP return code
   */
  public final int send(ContentFactory request) throws IOException {
    HttpClient			httpClient;
    String                      proxyConfiguration;
    PostMethod			method;
    RequestEntity		requestEntity;
    InputStream			input;
    int				retCode;

    httpClient = new HttpClient();
    proxyConfiguration = session.getConfiguration().getProperty("http.proxy.host");

    if (proxyConfiguration != null && !proxyConfiguration.equals("")) {
      HostConfiguration		hostConfig;
      String			proxyHost;
      int			proxyPort;

      hostConfig = httpClient.getHostConfiguration();
      proxyHost = session.getConfiguration().getProperty("http.proxy.host").trim();
      proxyPort = Integer.parseInt(session.getConfiguration().getProperty("http.proxy.port").trim());
      hostConfig.setProxy(proxyHost, proxyPort);
      if (!session.getConfiguration().getProperty("http.proxy.user").equals("")) {
	String				user;
	String				pwd;
	UsernamePasswordCredentials	credentials;
	AuthScope			authscope;

	user = session.getConfiguration().getProperty("http.proxy.user").trim();
	pwd = session.getConfiguration().getProperty("http.proxy.password").trim();
	credentials = new UsernamePasswordCredentials(user, pwd);
	authscope = new AuthScope(proxyHost, proxyPort);
	httpClient.getState().setProxyCredentials(authscope, credentials);
      }
    }

    input = request.getContent();
    method = new PostMethod(session.getUser().getPartner().getBank().getURL().toString());
    method.getParams().setSoTimeout(30000);
    requestEntity = new InputStreamRequestEntity(input);
    method.setRequestEntity(requestEntity);
    method.setRequestHeader("Content-type", "text/xml; charset=ISO-8859-1");
    retCode = -1;
    retCode = httpClient.executeMethod(method);
    response = new InputStreamContentFactory(method.getResponseBodyAsStream());

    return retCode;
  }

  /**
   * Returns the content factory of the response body
   * @return the content factory of the response.
   */
  public ContentFactory getResponseBody() {
    return response;
  }

  //////////////////////////////////////////////////////////////////
  // DATA MEMBERS
  //////////////////////////////////////////////////////////////////

  private EbicsSession				session;
  private ContentFactory			response;
}
