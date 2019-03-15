package com.example.kwejk.model;

public class Gif {

    String name;
    String username;
    Boolean favourite;
    int categoryId;

    public Gif(String name, String username, Boolean favourite, int categoryId) {
        this.name = name;
        this.username = username;
        this.favourite = favourite;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

}


