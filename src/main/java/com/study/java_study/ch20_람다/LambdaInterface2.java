package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public class LambdaInterface2 {
    public static void main(String[] args) {
        // Runnable
        Runnable runnable = () -> System.out.println("게임 시작");
        runnable.run();

        // Supplier
        Supplier<String> supplier = () -> "물 추가";
        supplier.get();

        // Consumer
        Consumer<String> enter = s -> {
            if (s.equals("홍길동")) {
                System.out.println(s + "님 안녕하세요");
            } else {
                System.out.println("누구세요?");
            }
        };
        enter.accept("사람");

        // Function
        Function<Integer, Double> getSqrt = i -> Math.sqrt(i);
        System.out.println(getSqrt.apply(102));

        // Predicate
        Predicate<String> isNumber = s -> Pattern.compile("\\d+").matcher(s).matches();
        System.out.println(isNumber.test("102"));
        System.out.println(isNumber.test("11o"));

    }
}
