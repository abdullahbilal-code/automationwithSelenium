package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {
    private static Logger logger = LogManager.getLogger(Log4jDemo.class);
    public static void main (String [] args){
        System.out.println(" Hello World...!\n");

        logger.info("This is Information Message");
        logger.error("This is error message");
        logger.warn("This is warning message");
        logger.fatal("This is an fatal message");
        System.out.println("\n Completed..!");


    }


}
