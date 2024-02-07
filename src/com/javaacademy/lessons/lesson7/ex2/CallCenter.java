package com.javaacademy.lessons.lesson7.ex2;

import java.util.function.Consumer;

/**
 * Центр обзвона клиентов
 */
public class CallCenter {

    /**
     * Позвонить клиенту. Принимает в себя:
     *
     * @param operator - функцию действия оператора (т.е как оператор будет звонить)
     * @param text - текст, который оператор скажет клиенту
     */
    public void call(Consumer<String> operator, String text) {
        operator.accept(text);
    }
}
