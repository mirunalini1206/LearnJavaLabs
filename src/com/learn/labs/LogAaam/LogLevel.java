package com.learn.labs.LogAaam;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by santoshdandey on 3/15/17.
 */
public class LogLevel {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        logger.setLevel(Level.INFO);

        logger.log(Level.INFO, "hey");
        logger.log(Level.FINER, "Pattu");
        logger.log(Level.SEVERE, "Stupid Trump");
    }
}
