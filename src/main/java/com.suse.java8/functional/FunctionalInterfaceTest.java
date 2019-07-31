package com.suse.java8.functional;

@FunctionalInterface()
public interface FunctionalInterfaceTest {

    String getAString();

    default String getName(){
        return "FuntionalInterfaceTest";
    }
}
