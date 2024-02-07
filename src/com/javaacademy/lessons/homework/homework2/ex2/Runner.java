package com.javaacademy.lessons.homework.homework2.ex2;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        HashMap<Item, Integer> map = new HashMap<>();
        map.put(new Item("Яблоко"), 1);
        map.put(new Item("Банан"), 2);
        map.put(new Item("Апельсин"), 3);

        System.out.println(map);
        Integer value = map.get(new Item("Апельсин"));
        System.out.println(value);
    }
}
