package com.study.java_study.ch04_제어;

public class Gugudan {
    public static void main(String[] args) {
        /*
        [2단]
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18

        [9단]
        9 x 1 = 9
        ...
        9 x 9 = 81
         */

        for (int i = 0; i < 8; i++) {
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " x " + num + " = " + (dan * num));
            }
            System.out.println();
        }

//        for (int i = 2; i < 10; i++) {
//            System.out.println("[" + i + "단]");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//            System.out.println();
//        }
    }
}