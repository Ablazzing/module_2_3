package com.javaacademy.lessons.lesson10.ex2;

import java.util.List;

public class Race {
    private List<Car> cars;

    public Race(List<Car> cars) {
        this.cars = cars;
    }

    public void startRace() {
        cars.forEach(car -> car.ride());
    }
}
