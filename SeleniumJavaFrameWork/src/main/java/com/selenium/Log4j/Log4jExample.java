package com.selenium.Log4j;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.*;

public class Log4jExample {

	
	private static Logger logger = LogManager.getLogger(Log4jExample.class);
	
	public static void main(String[] args) {
		
		System.out.println("welcome to log4j\n");
		
		
		logger.trace("this is a trace message");
		logger.info("login to log4jExample class");
		logger.error("if login is failed then it will display the error");
		logger.warn("this is a wraning messsage");
		logger.fatal("this is a fatal message");
		
	    System.out.println("it is end of the program");
		
	
	}

}
