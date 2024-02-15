package com.javaacademy.lessons.lesson10.ex5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentGroup {
    private List<String> studentNames;

    public StudentGroup(List<String> studentNames) {
        this.studentNames = studentNames;
    }

    public String getNameFirstStudent() {
        return studentNames.get(0);
    }
}
