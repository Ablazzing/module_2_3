package com.javaacademy.lessons.homework.homework3.ex1;

import java.time.LocalDateTime;

public class Review {
    private int id;
    private String text;
    private int likes;
    private LocalDateTime createdDate;

    public Review(int id, String text, int likes, LocalDateTime createdDate) {
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", createdDate=" + createdDate +
                '}';
    }
}
