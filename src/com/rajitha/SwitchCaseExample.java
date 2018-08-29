package com.rajitha;

public class SwitchCaseExample {

    public static void main(String args[]) {

        String busStop = "Anakapalli";

        switch (busStop) {
            case "London":
                System.out.println("your Stop London reached, please get down");
                break;

            case "Bristol":
                System.out.println("your Stop Bristol reached, please get down");
                break;

            case "Plymouth":
                System.out.println("your Stop Plymouth reached, please get down");
                break;

            case "Cornwall":
                System.out.println("your Stop Cornwall reached, please get down");
                break;

            case "id":
                System.out.println("your Stop 5 reached, please get down");
                //return driver.findElement(By.id("iugugd"));
                break;
            default:
                System.out.println("You missed your sto, or you took wroing bus please contact driver of this bus!!!");
                break;

        }

    }
}
