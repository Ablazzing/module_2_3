package com.javaacademy.lessons.lesson10.ex2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car(), new FastCar(), new Car());
        Race race = new Race(cars);
        race.startRace();
    }
}
