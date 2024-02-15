package com.javaacademy.lessons.lesson10.ex6;

public class Runner {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Audi car = factory.createCar(Audi.class);
        Bmw bmw = factory.createCar(Bmw.class);
    }
}
