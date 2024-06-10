package com.study.java_study.ch22_예외;

public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception {
            for (int i = 0; i < length; i++) {
                System.out.println("i: " + nums[i]);
            }
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1, 2, 3, 4, 5};

        try {
            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");

    }
}
