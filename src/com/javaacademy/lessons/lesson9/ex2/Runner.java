package com.javaacademy.lessons.lesson9.ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Runner {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
            InstantiationException {
        //Неизвестный объект
        Object blackBox = getBlackBox();

        //Вытаскиваем класс из объекта
        Class<? extends Object> aClass = blackBox.getClass();
        //Получаем список полей класса
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            //Открываем доступ к приватному полю
            field.setAccessible(true);
            //Вытаскиваем значение поля
            System.out.println(field.get(blackBox));
            //Название поля
            System.out.println(field.getName());
            //Вытаскиваем тип поля
            System.out.println(field.getType());
            //Узнаем, есть ли
            boolean isFieldPrivate = Modifier.isPrivate(field.getModifiers());
            System.out.println("Модификатор доступа private? - " + isFieldPrivate);
            System.out.println("___________________________________________");
        }
        //Как хранятся модификаторы доступа
        //final - non final
        //1     - 0
        //private protected default public
        //1        0        0       0
        //00001101110 -> десятичная система

        //Получение конструктора класса из объекта blackbox
        Constructor<?> constructor = blackBox.getClass().getConstructors()[0];
        //Создание экземпляра с помощью конструктора
        Object blackbox2 = constructor.newInstance();
        System.out.println(blackBox);
        System.out.println(blackbox2);
    }

    private static Object getBlackBox() {
        return new BlackBox();
    }
}
