package com.javaacademy.lessons.homework.homework1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> integersListOne = new ArrayList<>(List.of(5,2,4));
        ArrayList<Integer> integersListTwo = new ArrayList<>(List.of(7,10));
        ArrayList<Integer> finalList = new ArrayList<>();
        finalList.addAll(integersListOne);
        finalList.addAll(integersListTwo);
        try {
            finalList.remove(2);
        } catch (Exception e) {
            System.out.println("такого индекса нет");
        }
        System.out.println(finalList.indexOf(10));
    }
}
