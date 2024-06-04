package com.study.java_study.test;

import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        int[][] intArr = {{8, 1, 3}, {3, 10, 1}, {7, 5, 0}, {7, 5, 0}};
        List<List<Integer>> intList = new ArrayList<>();
        for(int[] i : intArr) {
            List<Integer> li = new ArrayList<>();
            for(int j : i) {
                li.add(j);
            }
            intList.add(li);
        }

        System.out.println(intList);

        intList.sort((o1, o2) -> o1.get(1) > o2.get(1) ? 1 : -1);

        System.out.println(intList);
    }
}
