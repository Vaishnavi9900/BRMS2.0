package com.BasicData;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LoggerUtil {
	
	 private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

	    // You can use this logger throughout your code.
	    public static void logInfo(String message) {
	        logger.info(message);
	    }

	    public static void logError(String message, Throwable throwable) {
	        logger.error(message, throwable);
	    }

	    public static void logDebug(String message) {
	        logger.debug(message);
	    }


}
