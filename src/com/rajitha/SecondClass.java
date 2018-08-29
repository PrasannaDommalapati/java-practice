package com.rajitha;

public class SecondClass {

    private final int MAX = 10;
    final double PI = 3.14;

    private static String name;


    //<Access Specifier> class ClassName  {}

    /**
     * Varaiable
     * <p>
     * <access specifier> dataType variableName; //declaring a variable
     * <access specifiers> --> public, private , protected, default
     * <dataTypes> --> int, String, float, double, char [primitive data types starts with lower case]
     * By, WebElement
     * <p>
     * variableName = value; //assigning a value to a variable
     * '='  Assignment operator
     * '+'  String Concatenation operator
     * <access specifier> dataType variableName = value;
     * <access specifier> dataType variableName, variableName2, variableName3;
     */

    public static void  main (String args []){

        SecondClass sc = new SecondClass();

        int i;

        i = 10;

        int j = 20;

        int k, l, m;
        k = l = m = 10;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        sc.methodOne("Automation"); //if want to use a non static method in a static method you can use only with object

    }

    // accessSpecifier returnType methodName () { <- logic->} declaring a method syntax4
    //methodName(params, params); //calling a method

    public void methodOne(String name) {
        int z= 14;

        System.out.println("I am Method one:" +name);

    }

    class Test {

        protected String name;

        private int age;
        private double weight;
        private String dob;
    }


}
