package com.rajitha;

public class IfExample {

    public static void main(String args[]) {

        double bankBalance = 5000.00;
        double withdrawAmount = 1200.00;

        //if(boolean) { }
        //if(boolean) { } else {}
        if (withdrawAmount < bankBalance) {
            System.out.println("Please collect cash from the cash point");
        } else if(withdrawAmount > bankBalance){
            System.out.println("Please choose different amount");
        } else if(withdrawAmount == bankBalance) {
            System.out.println("your balance will be zero after this transaction");
        }
        else {
            //only when all if are false
            System.out.println("All FAil");

        }
//        if (withdrawAmount > bankBalance) {
//            System.out.println("Please choose different amount");
//        }
//        if (withdrawAmount == bankBalance) {
//            System.out.println("your balance will be zero after this transaction");
//        }

    }

}
