package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

public class Article {
    private int id;
    private String title;
    private String introdction;
    private String picture;
    private Bitmap bitmap;

    public Article() {
    }

    public Article(int id, String title, String introdction, String picture, Bitmap bitmap) {
        this.id = id;
        this.title = title;
        this.introdction = introdction;
        this.picture = picture;
        this.bitmap = bitmap;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntrodction() {
        return introdction;
    }

    public void setIntrodction(String introdction) {
        this.introdction = introdction;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", introdction='" + introdction + '\'' +
                ", picture='" + picture + '\'' +
                ", bitmap=" + bitmap +
                '}';
    }
}
