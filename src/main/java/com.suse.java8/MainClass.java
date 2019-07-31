package com.suse.java8;

import org.apache.log4j.Logger;

import com.suse.java8.functional.FunctionalInterfaceTest;
import com.suse.java8.functional.FunctionalInterfaceTestImpl;

public class MainClass {

    final static Logger logger = Logger.getLogger(MainClass.class);

    public static void main(String[] args) {
        FunctionalInterfaceTest test = new FunctionalInterfaceTestImpl();
        logger.info("String: "+test.getAString());
        logger.info("Name: " +test.getName());

        FunctionalInterfaceTest test1 = ()->{
            return "Test1 String";
        };

        logger.info("Tester1 Lambda "+ test1.getAString());
    }
}
