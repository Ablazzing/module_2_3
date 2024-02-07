package com.javaacademy.lessons.homework.homework3.ex5;

import java.util.function.ToIntFunction;

@FunctionalInterface
public interface Ruler<T> extends ToIntFunction<T> {
}
