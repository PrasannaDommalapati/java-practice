package com.rajitha;

public class IfElseIfCondition {

    public static void main(String args[]){

        int i = 90;
        int j = 900;

        String str1 = "prasanna";
        String str2 = "kumar";

        if(str1.equals(str2)) {
            System.out.println("strings compareed are True");
        }

        if(i == j){ //== is a int comparing oparator

            System.out.println("i = j is True");

        }else if(j<i){

            System.out.println("This is false");

        }else {

            System.out.println("None of the above statements are correct");
        }
    }
}
