package com.javaacademy.lessons.homework.homework2.ex3;

public class Detail {
    private String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        detail.name = this.name;
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
