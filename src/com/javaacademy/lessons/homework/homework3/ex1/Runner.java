package com.javaacademy.lessons.homework.homework3.ex1;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        //Задание №1: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)
        //Создать коллекцию, которая хранит отсортированные отзывы по лайкам и дата + время отзыва.
        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:
        //сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые отзывы

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
        Comparator<Review> comparator = Comparator.comparingInt(Review::getLikes)
                .thenComparing(Review::getCreatedDate)
                .thenComparing((review1, review2) -> review1.getId() - review2.getId())
                .reversed();
        TreeSet<Review> reviews = new TreeSet<>(comparator);
        LocalDateTime review1Date = LocalDateTime.of(2024, 1, 25, 13, 37);
        LocalDateTime review2Date = LocalDateTime.of(2024, 1, 25, 16, 37);
        LocalDateTime review3Date = LocalDateTime.of(2024, 1, 25, 13, 37);
        reviews.addAll(List.of(
                new Review(1, "отличный товар", 200, review1Date),
                new Review(2, "так себе товар", 100, review2Date),
                new Review(3, "плохой товар", 100, review3Date),
                new Review(4, "очень плохой товар", 100, review3Date)
        ));
        reviews.forEach(System.out::println);
    }
}
