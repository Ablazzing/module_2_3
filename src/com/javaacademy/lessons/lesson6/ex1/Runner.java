package com.javaacademy.lessons.lesson6.ex1;

import java.util.Random;

public class Runner {
    private static int lastX = 0;

    public static void main(String[] args) {

        //Функция Y - детерминирована
        // y = x + 1
        //y?, x = 4
        //y = 4 + 1
        //y = 5
        int result = funcY(4);
        System.out.println(result);
        System.out.println("___________________________________________");

        System.out.println(getRandom());
    }

    /**
     * Не чистая функция (результат всегда разный)
     */
    public static int getRandom() {
        return  new Random().nextInt();
    }


    /**
     * Чистая функция (результат всегда одинаковый, при одном же аргументе)
     * не создает побочных эффектов
     */
    public static int funcY(int x) {
        return x + 1;
    }
}
