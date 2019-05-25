/*
 *
 *
 * $Id: DefaultEbicsLogger.java 8 2019-05-21 19:11:25Z schartz $
 */

package com.github.schartz.bebics.session;

import java.io.File;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
import com.github.schartz.bebics.exception.ReturnCode;
import com.github.schartz.bebics.interfaces.EbicsLogger;
import com.github.schartz.bebics.io.IOUtils;


/**
 * A simple EBICS transfers logger base on log4j framework.
 *
 * @author hacheni
 *
 */
public class DefaultEbicsLogger implements EbicsLogger {

  /**
   * Constructs a new ebics logger
   */
  public DefaultEbicsLogger() {
    this(null);
  }

  /**
   * Constructs a new ebics logger with a given file
   * @param logFile the log file
   */
  public DefaultEbicsLogger(File logFile) {
    this.logFile = logFile;
    logger = Logger.getLogger(DefaultEbicsLogger.class);
    consoleAppender = new ConsoleAppender();
    fileAppender = new RollingFileAppender();
  }

  /**
   * Enables or disable the console log
   * @param enabled the console log state
   */
  public void setConsoleLoggingEnabled(boolean enabled) {
    if (enabled) {
      if (!logger.isAttached(consoleAppender)) {
	addConsoleAppender();
      }
    } else {
      removeConsoleAppender();
    }
  }

  /**
   * Enables or disable the file logging
   * @param enabled the file log state
   */
  public void setFileLoggingEnabled(boolean enabled) {
    if (enabled) {
      if (!logger.isAttached(fileAppender)) {
	if (logFile != null) {
	  addFileAppender();
	}
      }
    } else {
      removeFileAppender();
    }
  }

  /**
   * Adds the console appender to the current logger.
   */
  private void addConsoleAppender() {
    PatternLayout		layout;

    layout = new PatternLayout();
    layout.setConversionPattern("%d %5p - %m%n");
    consoleAppender.setLayout(layout);
    consoleAppender.setTarget("System.out");
    consoleAppender.activateOptions();
    logger.addAppender(consoleAppender);
  }

  /**
   * Removes the console appender from the current logger.
   */
  private void removeConsoleAppender() {
    if (logger.isAttached(consoleAppender)) {
      logger.removeAppender(consoleAppender);
    }
  }

  /**
   * Adds the file appender to the current logger.
   */
  private void addFileAppender() {
    PatternLayout		layout;

    layout = new PatternLayout();
    layout.setConversionPattern("%d %5p - %m%n");
    fileAppender.setLayout(layout);
    fileAppender.setAppend(true);
    fileAppender.setFile(logFile.getAbsolutePath());
    fileAppender.setImmediateFlush(true);
    fileAppender.setMaxFileSize("5MB");
    fileAppender.setMaxBackupIndex(1);
    fileAppender.activateOptions();
    logger.addAppender(fileAppender);
  }

  /**
   * Removes the file appender from the current logger.
   */
  private void removeFileAppender() {
    if (logger.isAttached(fileAppender)) {
      logger.removeAppender(fileAppender);
    }
  }

  /**
   * Disables the log process
   */
  @Deprecated
  public void disable() {
    Logger.shutdown();
  }

  /**
   * Sets the logger level.
   * @param level the level to set
   */
  public void setLevel(int level) {
    logger.setLevel(Level.toLevel(level));
  }

  @Override
  public void info(String message) {
    logger.info(message);
  }

  @Override
  public void warn(String message) {
    logger.warn(message);
  }

  @Override
  public void warn(String message, Throwable throwable) {
    logger.warn(message, throwable);
  }

  @Override
  public void error(String message) {
    logger.error(message);
  }

  @Override
  public void error(String message, Throwable throwable) {
    logger.error(message, throwable);
  }

  @Override
  public void report(ReturnCode returnCode) {
    if (returnCode.isOk()) {
      info(returnCode.getText());
    } else {
      error(returnCode.getText());
    }
  }

  @Override
  public void setLogFile(String logFile) {
    this.logFile = IOUtils.createFile(logFile);
  }

  // --------------------------------------------------------------------
  // DATA MEMBERS
  // --------------------------------------------------------------------

  private Logger 				logger;
  private ConsoleAppender			consoleAppender;
  private RollingFileAppender			fileAppender;
  private File					logFile;

  public static final int			ALL_LEVEL = Level.ALL_INT;
  public static final int			INFO_LEVEL = Level.INFO_INT;
  public static final int			WARN_LEVEL = Level.WARN_INT;
  public static final int			ERROR_LEVEL = Level.ERROR_INT;
}
