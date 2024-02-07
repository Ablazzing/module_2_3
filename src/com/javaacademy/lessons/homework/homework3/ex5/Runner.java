package com.javaacademy.lessons.homework.homework3.ex5;

public class Runner {
    public static void main(String[] args) {
        //Задание №5: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка(длина), возвращает длину лодки
        //Измеритель животных: на вход животное(длина тела, длина хвоста),
        //возвращает сумму длин тела и хвоста
        Ruler<Boat> boatRuler = Boat::getLength;
        Ruler<Animal> animalRuler = animal -> animal.getLengthBody() + animal.getLengthTail();
        System.out.println(boatRuler.applyAsInt(new Boat(200)));
        System.out.println(animalRuler.applyAsInt(new Animal(50, 10)));

    }
}
