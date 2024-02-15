package com.javaacademy.lessons.lesson10.ex6;

import java.lang.reflect.InvocationTargetException;

public class Factory {

    public <T> T createCar(Class<T> tclazz) {
        try {
            return (T) tclazz.getConstructors()[0].newInstance();
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Audi createAudi() {
        return new Audi();
    }

    public Bmw createBmw() {
        return new Bmw();
    }

    public Toyota createToyota() {
        return new Toyota();
    }
}
