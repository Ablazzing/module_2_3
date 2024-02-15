package com.javaacademy.lessons.homework.homework4.ex3;

import java.util.Objects;

public class SkyScrapper {
    private String name;
    private int height;

    public SkyScrapper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkyScrapper scrapper = (SkyScrapper) o;
        return height == scrapper.height && Objects.equals(name, scrapper.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public String toString() {
        return "SkyScrapper{" +
               "name='" + name + '\'' +
               ", height=" + height +
               '}';
    }
}
