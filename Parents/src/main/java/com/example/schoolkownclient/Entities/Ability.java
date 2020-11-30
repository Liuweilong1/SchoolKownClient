package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

public class Ability {
    private int id;
    private String title;
    private String introduction;
    private String picture;
    private Bitmap bitmap;

    public Ability() {
    }

    public Ability(int id, String title, String introduction, String picture, Bitmap bitmap) {
        this.id = id;
        this.title = title;
        this.introduction = introduction;
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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
        return "Ability{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", introduction='" + introduction + '\'' +
                ", picture='" + picture + '\'' +
                ", bitmap=" + bitmap +
                '}';
    }
}
