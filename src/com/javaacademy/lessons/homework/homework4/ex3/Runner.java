package com.javaacademy.lessons.homework.homework4.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        //Задание №3 - Небоскребы, небоскребы, а я...
        //Дано: Небоскреб - имя небоскреба, его высота в метрах.
        //Необходимо создать небоскребы:
        //1 Всемирный торговый центр 1 - 541м
        //2 Шанхайская башня - 632м
        //3	Бурдж-Халифа - 828м
        //4 Международный финансовый центр Пинань - 599м
        //5 Абрадж аль-Бейт - 601м
        //6 Всемирный центр Лотте - 555м
        List<SkyScrapper> skyScrappers = List.of(
                new SkyScrapper("Всемирный торговый центр 1", 1_001),
                new SkyScrapper("Шанхайская башня", 632),
                new SkyScrapper("Бурдж-Халифа", 828),
                new SkyScrapper("Международный финансовый центр Пинань", 599),
                new SkyScrapper("Абрадж аль-Бейт", 1_001),
                new SkyScrapper("Всемирный центр Лотте", 555),
                new SkyScrapper("Бурдж-Халифа", 828)
        );
        List<SkyScrapper> listWithoutDuplicate = new ArrayList<>(new LinkedHashSet<>(skyScrappers));

        //Вывести только первые три небоскреба.
        listWithoutDuplicate.stream().limit(3).forEach(System.out::println);
    System.out.println("___________________________________________");
        //Вывести самый высокий небоскреб.
        listWithoutDuplicate.stream()
                .max(Comparator.comparingInt(SkyScrapper::getHeight))
                .ifPresent((System.out::println));

        System.out.println("___________________________________________");
        //Вывести те небоскребы, которые выше километра.
        listWithoutDuplicate.stream()
                .filter(skyScrapper -> skyScrapper.getHeight() > 1_000)
                .peek(System.out::println)
                .reduce(((skyScrapper, skyScrapper2) -> skyScrapper2))
                .ifPresentOrElse(
                        (ignored) -> {},
                        () -> System.out.println("Небоскреба выше километра нет"));

        //Занести данный список в List! Дважды положить бурдж халифа в лист.
        //С помощью стримов:
        //Убрать дубликаты
        //(РАЗНЫЕ СТРИМЫ)
        //Вывести только первые три небоскреба.
        //Вывести самый высокий небоскреб.
        //Вывести те небоскребы, которые выше километра.
        //Если выше нет, то вывести на экран: небоскреба выше километра - нет.

    }
}
