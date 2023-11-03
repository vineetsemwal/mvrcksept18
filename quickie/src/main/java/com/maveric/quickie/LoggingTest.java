package com.maveric.quickie;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest {

    private static final Logger Log = LogManager.getLogger(LoggingTest.class);

    public static void main(String[] args) {
        LoggingTest demo=new LoggingTest();
        demo.runApp();

    }

    void runApp() {
        Log.debug("i am debug");
        Log.info("i  am info");
        Log.error("i am error");
    }
}