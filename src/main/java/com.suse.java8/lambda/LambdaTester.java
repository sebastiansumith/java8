package com.suse.java8.lambda;


import org.apache.log4j.Logger;

public class LambdaTester {

    private static Logger logger = Logger.getLogger(LambdaTester.class);

    public static void main(String[] args) {

        MathOperation addition = (double a, double b) ->{
            return a+b;
        };

        MathOperation subtraction = (double a, double b) ->{
            return a-b;
        };

        MathOperation division = (double a, double b) ->{
            return a/b;
        };

        MathOperation multiplication = (double a, double b) ->{
            return a*b;
        };

        logger.info("Multiplication: " +multiplication.operation(10.0, 5.0));
        logger.info("Addition: " +addition.operation(10.0, 5.0));
        logger.info("Subtraction: " +subtraction.operation(10.0, 5.0));
        logger.info("Division: " +division.operation(10.0, 5.0));


        Greetings greetings = (message)->{
            logger.info("Hello "+message);
        };

        Greetings greeting1 = message->{
            logger.info("Hello "+message);
        };

        greeting1.greetings("Sumith");
        greetings.greetings("SuSe");

    }


    interface MathOperation{
        double operation(double a, double b);
    }

    interface Greetings{
        void greetings(String name);
    }

}
