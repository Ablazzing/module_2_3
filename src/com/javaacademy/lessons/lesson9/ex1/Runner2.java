package com.javaacademy.lessons.lesson9.ex1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Пример, как можно вытащить из контейнера набор фруктов (без геттера),
 * положить туда фрукт, отличный от типа фруктов, которые там лежат
 */
public class Runner2 {
    public static void main(String[] args) throws IllegalAccessException {
        Container container = new Container();
        container.addFruits(new ArrayList<>(List.of(new Banana())));

        //Находим поле с именем fruits
        Field fruitsFromContainerField = Arrays.stream(Container.class.getDeclaredFields())
                .filter(field -> "fruits".equals(field.getName()))
                .findFirst()
                .orElseThrow();
        //Т.к. поле приватно, мы должны поменять состояние доступа
        fruitsFromContainerField.setAccessible(true);
        //Вытаскиваем набор фруктов
        Object fruits = fruitsFromContainerField.get(container);
        //Приводим тип
        List list = (List) fruits;
        //Добавляем фрукт - апельсин
        list.add(new Orange());
        System.out.println(fruits);
    }
}
