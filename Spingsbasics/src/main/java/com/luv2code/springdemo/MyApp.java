package com.luv2code.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {
    private static final Logger logger = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
//        logger.debug("Debug message");
//        logger.info("Info message");
//        logger.warn("Warning message");
//        logger.error("Error message");

        //Example of Lombook Auto Constructor
        Cricket cricket = new Cricket("India",01);
//        cricket.setTeam("India");
//        cricket.setRank(02);

        System.out.println(cricket.getTeam());
        System.out.println(cricket.getRank());
        System.out.println(cricket.toString());
    }
}