/*
 *
 *
 * $Id: X509Constants.java 8 2019-05-21 19:11:25Z schartz $
 */

package org.kopi.ebics.certificate;

/**
 * X509 certificate constants
 *
 * @author schartz
 *
 */
public interface X509Constants {

  /**
   * Certificates key usage
   */
  int			SIGNATURE_KEY_USAGE			= 1;
  int			AUTHENTICATION_KEY_USAGE		= 2;
  int			ENCRYPTION_KEY_USAGE			= 3;

  /**
   * Certificate signature algorithm
   */
  String		SIGNATURE_ALGORITHM			= "SHA256WithRSAEncryption";

  /**
   * Default days validity of a certificate
   */
  int			DEFAULT_DURATION			= 365;

  /**
   * EBICS key size
   */
  int			EBICS_KEY_SIZE				= 2048;
}
