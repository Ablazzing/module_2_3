package com.javaacademy.lessons.homework.homework4.ex2;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 - Сколько здесь "о" ?
        //Создать набор уникальных слов: "тонь", "тополь", "боль", "рой", "стройка"
        //Внутри одного стрима:
        //Посчитать количество букв "о" в одном слове
        //Посчитать сумму количества букв "о" во всех словах из набора
        //Если буквы "о" есть - напечатать количество букв "о", если нет выкинуть исключение
        //ожидаемый результат:
        // 6
        Set<String> words = Set.of( "стрйка");
        words.stream()
                .map(word -> getCountSymbolFromWord(word, "о"))
                .reduce(Long::sum)
                .filter(count -> count > 0)
                .ifPresentOrElse(
                        (count) -> System.out.println("Количество букв 'o': " + count),
                        () -> {throw new RuntimeException("Нет букв o");}
                );

    }

    private static long getCountSymbolFromWord(String word, String findSymbol) {
        return Arrays.stream(word.split(""))
                .filter(findSymbol::equalsIgnoreCase)
                .count();
    }
}
