package com.javaacademy.lessons.lesson6.ex8;

import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {
        Function<String, Integer> getLengthFunction = (text) -> text.length();
        Integer length = getLengthFunction.apply("Yuri");
        System.out.println(length);
    }
}
