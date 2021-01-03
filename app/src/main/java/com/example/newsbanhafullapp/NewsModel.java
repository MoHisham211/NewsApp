package com.example.newsbanhafullapp;

import java.util.ArrayList;

public class NewsModel {
    ArrayList<Article> articles;
    public ArrayList<Article> getArticles() {
        return articles;
    }
}
class Article{
    private String author;
    private String title;
    private String description;
    private String publishedAt;

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    private String url;
    private String urlToImage;

}
