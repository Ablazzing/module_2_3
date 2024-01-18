package com.javaacademy.lessons.homework.homework1.ex1;

import com.javaacademy.lessons.homework.homework1.ex1.zoo.Bird;
import com.javaacademy.lessons.homework.homework1.ex1.zoo.Dog;
import com.javaacademy.lessons.homework.homework1.ex1.zoo.Tiger;
import com.javaacademy.lessons.homework.homework1.ex1.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Zoo<Dog, Bird, Tiger> zoo = new Zoo<>(new Dog(), new Bird(), new Tiger());
        zoo.getAnimal1().bark();
        zoo.getAnimal2().fly();
        zoo.getAnimal3().growl();

    }
}
