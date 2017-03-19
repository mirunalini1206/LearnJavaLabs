package com.learn.labs.LogAaam;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by santoshdandey on 3/15/17.
 */
public class LogCall2 {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        logger.log(Level.INFO, "Hi Pattu");

        logger.log(Level.INFO, "How are u");
    }
}
