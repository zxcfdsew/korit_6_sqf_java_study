package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {
    public static void main(String[] args) {

        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(0, "김준일");
        strMap.put(1, "김준이");
        strMap.put(2, "김준삼");
        strMap.put(3, "김준사");

        System.out.println(strMap);

        System.out.println(strMap.get(0));

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );
        System.out.println(lang);
        System.out.println(lang.get("java"));
        System.out.println(lang.entrySet());

        // Entry는 Set 자료형에만 들어감
        Set<Map.Entry<String, String>> entries = lang.entrySet();

        for (Map.Entry<String, String> entry : lang.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
    }
}