package com.rajitha;

public class StarLoop {

    public static void main(String args[] ) {

        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 8-i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}