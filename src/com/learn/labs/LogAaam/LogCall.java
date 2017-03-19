package com.learn.labs.LogAaam;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by santoshdandey on 3/15/17.
 */
public class LogCall {

    public static void main(String[] args) {

        LogManager logManager = LogManager.getLogManager();

        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.log(Level.INFO, "Hi There ");

        logger.log(Level.INFO, "I am using Intellij");

        //System.out.println(logger.log(Level.INFO););
    }
}
