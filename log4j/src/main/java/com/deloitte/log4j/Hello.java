package com.deloitte.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Logger log = LogManager.getLogger(Hello.class.getName());
		log.fatal("Fatal Message");
		log.error("Error Message");
		log.warn("Warn Message");
		log.info("Info Message");
		log.debug("Debug Message");
		log.trace("Trace Message");
		//hello

	}

}
