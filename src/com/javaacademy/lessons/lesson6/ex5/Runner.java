package com.javaacademy.lessons.lesson6.ex5;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        Calibrator heightCalibrator = children -> {
            if (children.getHeight() > 150) {
                return true;
            }
            return false;
        };
        Predicate<Children> heightCalibrator2 = children -> {
            if (children.getHeight() > 150) {
                return true;
            }
            return false;
        };

        Children children = new Children(151, 13);

        boolean result = heightCalibrator2.test(children);
        System.out.println("Ребенок проходи по росту:" + result);

    }
}
