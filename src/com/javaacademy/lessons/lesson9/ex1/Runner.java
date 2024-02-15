package com.javaacademy.lessons.lesson9.ex1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Banana> bananas = List.of(new Banana());
        List<Orange> oranges = List.of(new Orange());
        Container container = new Container();
        container.addFruits(bananas);
        System.out.println(container);
        container.addFruits(oranges);
        System.out.println(container);


        //концепция PECS - Producer extends Consumer super
        // extends <- class <- super
        // banana  -  fruit  - object

        // Producer extends - Поставщик поставляет
        //? extends Fruit <- - фрукт и все наследники. Невозможно положить новое значение.
        //Необходимо для ограничения возможности положить новое значение.
        List<Banana> bananas1 = List.of(new Banana());
        List<? extends Fruit>  myFruits1 = bananas1;
        //Не могу положить значение (кроме null)
        //myFruits1.add(new Banana())
        //Могу получить значение
        Fruit fruit = myFruits1.get(0);

        //Consumer super - Потребитель принимает
        //? super Fruit -> - фрукт и все родители. Невозможно получить значение типа фрукт.
        //Необходимо для ограничения получить значение.
        List<? super Fruit> myFruits2 = new ArrayList<Object>();
        //Могу положить любых наследников фруктов
        myFruits2.add(new Orange());
        myFruits2.add(new Banana());

        //Не могу получить тип (кроме object)
        Object o = myFruits2.get(0);
    }
}
