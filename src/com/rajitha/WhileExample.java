package com.rajitha;

public class WhileExample {

    public static void main(String args[]) {

        int i = 1;
        int j = 25;

        while(i < j) {
            System.out.println(i);
            i++;
        }

        System.out.println("I value after while loop:-"+i);
        /**
         * 1. While loop starts when checking the condition if it evaluates true
         * it executes the body statements of while otherwise fist stmt after while loop executes
         * 2. Once the condition is evaluated true then the program control stays in the loop until
         * the condition evaluates false
         * 3. Once the condition is fail the loop terminates and the end of while lifecycle
         */
    }
}
