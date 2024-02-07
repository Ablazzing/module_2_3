package com.javaacademy.lessons.homework.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        //Задание №4: Гори ясно!
        //Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
        //любого типа.
        //Создать с помощью лямбд выражений:
        //атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
        //костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
        Burning<Uran> nuclearReactor = (uran) -> System.out.println("Зеленый свет вокруг!");
        Burning<Wood> bonfire = wood -> System.out.println("желто-красный свет вокруг!");
        nuclearReactor.accept(new Uran());
        bonfire.accept(new Wood());
    }
}
