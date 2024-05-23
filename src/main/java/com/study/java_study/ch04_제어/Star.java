package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {

        /*
        *
        **
        ***
        ****
        *****
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        /*
         *****
         ****
         ***
         **
         *
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        /*
             *
            **
           ***
          ****
         *****
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j < 4 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("---------------------");

        /*
         *****
          ****
           ***
            **
             *
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("---------------------");

        /*
             *
            ***
           *****
          *******
         *********
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }



//        String star = "";
//        for(int i = 0; i < 5; i++) {
//            star += "*";
//            System.out.printf("%5s\n", star);
//        }

    }
}
