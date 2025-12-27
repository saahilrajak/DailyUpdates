package com.example.DailyUpdates.dto;

import java.util.List;

public class NewsResponse {
    int totalResults;
    List<NewsArticle> articles;

    public NewsResponse(int totalResults, List<NewsArticle> articles) {
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public NewsResponse(){}

    public int getTotalResults() {
        return totalResults;
    }

    public List<NewsArticle> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsArticle> articles) {
        this.articles = articles;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
