package com.javaacademy.lessons.homework.homework1.ex3;

import java.util.List;

public class Runner {
    public static void main(String[] args) throws Exception {
        Storage storage = new Storage();
        storage.addItems(List.of(
                new Item("Водка"),
                new Item("Пиво"),
                new Item("Вино"),
                new Item("Самогон")
        ));
        storage.getAllThings();
        try {
            System.out.println(storage.getThingsIndex(1));
        } catch (Exception e) {
            System.out.println("такого индекса нет");
        }
        storage.removeAllThings();
        System.out.println(storage);
    }
}
