package com.javaacademy.lessons.lesson10.ex1;

public class Human {
    private static int countHuman = 0;
    private String name;
    private int age;
    private Cat cat;

    public Human(String name, int age, Cat cat) {
        this.name = name;
        this.age = age;
        this.cat = cat;
        countHuman++;
    }

    public void sayMya() {
        System.out.println("Кошка мяукает");
    }
}
