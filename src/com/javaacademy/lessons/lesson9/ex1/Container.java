package com.javaacademy.lessons.lesson9.ex1;

import java.util.List;

/**
 * Контейнер для фруктов
 */
public class Container {
    //Можно будет складывать любую партию фруктов
    //Тип будет меняться в Runtime, т.е.
    //Может быть List<Banana>, List<Orange>, List<Fruit>
    private List<? extends Fruit> fruits;

    //В случае, если мы бы захотели докидывать фрукты в контейнер
    //private List<? super Fruit> fruits;

    public void addFruits(List<? extends Fruit> fruits) {
        this.fruits = fruits;
    }

    //В случае, если мы бы захотели докидывать фрукты в контейнер
    //  public void add(Fruit fruit) {
    //    fruits.add(fruit);
    //  }

    @Override
    public String toString() {
        return "Container{" +
                "fruits=" + fruits +
                '}';
    }
}
