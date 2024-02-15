package com.javaacademy.lessons.lesson10.ex4;

public class Airplane implements Flyable, Ride {
    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }

    @Override
    public void ride() {
        System.out.println("Самолет едет");
    }
}
