package com.example.DailyUpdates.dto;

public class NewsArticle {
    String author;
    String title;

    public NewsArticle(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public NewsArticle(){}


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
