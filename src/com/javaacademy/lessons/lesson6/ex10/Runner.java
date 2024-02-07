package com.javaacademy.lessons.lesson6.ex10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {
        Consumer<String> function = (arg) -> {
            try {
                FileWriter fileWriter = new FileWriter("");
                fileWriter.write(arg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}
