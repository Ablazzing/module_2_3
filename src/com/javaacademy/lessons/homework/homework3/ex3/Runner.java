package com.javaacademy.lessons.homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        //Задание №3: Поиск пары с помощью гадания
        //Создать функциональный гадание, который на вход принимает аргумент любого типа,
        //на выход возвращает да/нет.
        //Создать с помощью лямбд выражений:
        //ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
        //бабку гадалку: принимает Человека(возраст,рост),
        //возвращает да - если возраст + рост больше 210, нет - если меньше или равно
        Divination<String> chamomile = (name) -> name.length() % 2 == 0;
        Divination<Human> fortuneTeller = (human) -> human.getAge() + human.getHeight() > 210;
    }

    private static String convertAnswer(boolean value) {
        return value ? "да" : "нет";
    }
}
