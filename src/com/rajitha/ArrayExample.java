package com.rajitha;

public class ArrayExample {

   public static void main(String args[]) {

       //double marks[] = new double[5];
       //marks[0] = 85.5;
       //marks[1] = 42.5;
       //marks[4] = 99;

       double marks[] = {85.5,85,29,36,99};

       System.out.println(marks.length);

//       for(int index = 0; index<marks.length; index++) {
//
//               System.out.println(marks[index]);
//
//       }

       for(double value: marks) {

           System.out.println(value);

       }

       int index = 0;
       while(index < marks.length) {
           System.out.println(marks[index]);
           index++;

       }
   }

}
