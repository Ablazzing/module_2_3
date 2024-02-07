package com.javaacademy.lessons.homework.homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        //Задание №2: Сад
        //Создать два фрукта: яблоко, абрикос. (Без полей)
        //Создать функциональный интерфейс сад, который умеет выращивать фрукты.
        //Метод ничего не принимает.
        //Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
        //Яблочная ферма должна отдавать яблоки(не фрукты!), абрикосовая абрикосы(не фрукты!).
        Garden<Apple> appleGarden = Apple::new;
        Garden<Apricot> apricotGarden = Apricot::new;
        Apricot apricot = apricotGarden.get();
        Apple apple = appleGarden.get();
    }
}
