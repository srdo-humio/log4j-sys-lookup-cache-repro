package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);

        logger.info("System property not yet set");
        System.setProperty("testProperty", "firstValue");
        logger.info("System property set to first value");
        System.setProperty("testProperty", "secondValue");
        logger.info("System property set to second value");
    }
}