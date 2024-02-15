package com.javaacademy.lessons.homework.homework4.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Задание №1 - Список спец номеров
        //Создать класс машина. У машины есть номер.
        //Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
        //Создать 50 машин с номерами к0[01-50]се178
        //Соединить машины в единый стрим
        //Машины, с номерами 04[0-9] - это спец номера (врачи)
        //оставить только те машины, которые обладают спец номерами
        //Получить из машин номера
        //Соединить в единую строку, с разделителем в " ," - самостоятельное изучение
        //ожидаемый финал
        //"a040ан1799, a041ан799, ... , k048се178, k049се178"
        String result = Stream.concat(
                        generateCars("а%03dан799", 50),
                        generateCars("к%03dсе178", 50))
                .map(Car::getNumber)
                .filter(number -> "04".equals(number.substring(1, 3)))
                .collect(Collectors.joining(" ,"));
        System.out.println(result);
    }

    private static Stream<Car> generateCars(String template, int countCars) {
        AtomicInteger counter = new AtomicInteger();
        return Stream.generate(() -> new Car(generateNumber(template, counter.addAndGet(1))))
                .limit(countCars);
    }

    private static String generateNumber(String template, int number) {
        return template.formatted(number);
    }
}
