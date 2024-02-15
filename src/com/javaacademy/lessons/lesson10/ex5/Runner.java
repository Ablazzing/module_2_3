package com.javaacademy.lessons.lesson10.ex5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(
                List.of("Юрий", "Петр", "Юрий")
        );
        LinkedList<String> linkedList = new LinkedList<>(List.of("Юрий", "Петр", "Юрий"));
        StudentGroup studentGroup = new StudentGroup(students);
        StudentGroup studentGroup2 = new StudentGroup(linkedList);
    }
}
