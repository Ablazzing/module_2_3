package com.javaacademy.lessons.lesson6.ex3;

import com.javaacademy.lessons.lesson6.ex3.cars.Car;
import com.javaacademy.lessons.lesson6.ex3.cars.Machine;
import com.javaacademy.lessons.lesson6.ex3.cars.Moto;
import com.javaacademy.lessons.lesson6.ex3.cars.Truck;
import com.javaacademy.lessons.lesson6.ex3.factory.Factory;

public class Runner {
    public static void main(String[] args) {
        Factory carFactory2 = () -> new Car();

        Factory carFactory = () -> new Car();
        Factory motoFactory = () -> new Moto();
        Factory truckFactory = () -> new Truck();

        Machine machine = truckFactory.getMachine();
        Machine machine2 = motoFactory.getMachine();
        Machine machine3 = carFactory.getMachine();
    }
}
