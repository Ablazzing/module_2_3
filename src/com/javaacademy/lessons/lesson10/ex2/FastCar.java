package com.javaacademy.lessons.lesson10.ex2;

public class FastCar extends Car {
    @Override
    public void ride() {
        //throw new RuntimeException("Сломалось что то"); - нарушит принцип Лисков
        System.out.println("Машина очень быстро едет");
    }

    public void fastRide() {
        throw new RuntimeException("Сломалось что то");
    }
}
