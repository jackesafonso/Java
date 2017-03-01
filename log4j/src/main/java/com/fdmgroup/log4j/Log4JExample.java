package com.fdmgroup.log4j;

import org.apache.log4j.Logger;

public class Log4JExample {
	
	final static Logger logger = Logger.getLogger(Log4JExample.class);

    public static void main(String[] args) {

          Log4JExample obj = new Log4JExample();
          obj.logIt("message here");

    }

    private void logIt(String message) {

          logger.trace("This is trace : " + message);
          logger.debug("This is debug : " + message);
          logger.info("This is info : " + message);
          logger.warn("This is warn : " + message);
          logger.error("This is error : " + message);
          logger.fatal("This is fatal : " + message);

    }

}
