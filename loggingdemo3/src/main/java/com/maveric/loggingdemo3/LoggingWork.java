package com.maveric.loggingdemo3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingWork {
    private static final Logger Log= LogManager.getLogger(LoggingWork.class);

    public static void main(String[] args) {
        Log.info("i am info");
        Log.error("i am error");
    }
}
