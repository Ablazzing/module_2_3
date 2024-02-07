package com.javaacademy.lessons.lesson8.ex1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Промежуточные операции
        //Фильтрующие операции
        AtomicInteger counter = new AtomicInteger();
        //Фильтрация по условию
//        Stream.generate(() -> counter.addAndGet(1))
//                .filter(e -> e == 50)
//                .forEach(integer -> System.out.println(integer));

        //1, 2, 3, 4 ... 100
        counter.set(0);
        //Limit - ограничивает количество элементов
        //Skip - пропускает элементы
        Stream.generate(() -> new Human(counter.addAndGet(1)))
                .limit(100)
                .skip(150)
                .forEach(e -> System.out.println(e));
        System.out.println(counter);
        System.out.println("___________________________________________");

        //Удаление дубликатов
        Stream.generate(() -> new Human(0))
                .limit(10)
                .distinct()
                .forEach(e -> System.out.println(e));
        System.out.println("___________________________________________");

        counter.set(0);
        //Преобразующие операции
        //map - изменение типа
        Stream.generate(() -> new Human(counter.addAndGet(1)))
                .limit(10)
                .map(human -> human.getPassportNumber())
                .forEach(passportNumber -> System.out.println(passportNumber));

        System.out.println("___________________________________________");
        //peek - не изменяет тип, но при этом, вы можете поменять что то внутри объекта
        counter.set(0);
        Stream.generate(() -> new Human(counter.addAndGet(1)))
                .limit(10)
                .peek(e -> System.out.println(e))
                .peek(human -> human.setPassportNumber("ab №0"))
                .forEach(passportNumber -> System.out.println(passportNumber));

        System.out.println("___________________________________________");

        //O(n^2)
        //[1, 2, 1, 3, 4, 5, 5, 1, 2]
        //[1, 2, ]
//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j <; j++) {
//
//            }
//        }

        //FlatMap - устраняет вложенность, раскрывая элементы как стримы
        List<Human> group1 = List.of(new Human(1), new Human(2));
        List<Human> group2 = List.of(new Human(3), new Human(4), new Human(4));
        List<List<Human>> groupOfPeople = List.of(group1, group2);
        groupOfPeople.stream().flatMap(List::stream).forEach(human -> System.out.println(human));


        //Объединение двух стримов в один
        //Stream.concat(group1.stream(), group2.stream()).forEach(e -> System.out.println(e));

        List<Integer> integers = List.of(2, 5, 10, 1, 3, -1, 15);
        integers.stream().sorted().forEach(e -> System.out.println(e));
        System.out.println("___________________________________________");

        //Method reference - ссылка на метод
        List<Human> humans = List.of(new Human(3), new Human(2), new Human(5));
        humans.stream().sorted(Runner::sortHuman)
                .forEach(System.out::println);


        //Работа с ошибками
        humans.stream().forEach(Runner::handsUp);
    }

    private static void handsUp(Human human) {
        try {
            human.handsUp();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static int sortHuman(Human human1, Human human2) {
        int number1 = parsePassportNumber(human1.getPassportNumber());
        int number2 = parsePassportNumber(human2.getPassportNumber());
        return number1 - number2;
    }


    private static int parsePassportNumber(String passportNumber) {
        int index = passportNumber.indexOf("№");
        String number = passportNumber.substring(index + 1);
        return Integer.parseInt(number);
    }

}
