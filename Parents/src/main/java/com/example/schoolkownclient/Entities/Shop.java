package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Shop implements Serializable {
    private int id;
    private String name;
    private String price;
    private String scoring;
    private String introduction;
    private Bitmap picture;

    public Shop() {

    }

    public Shop(int id, String name, String price, String scoring, String introduction, Bitmap picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.scoring = scoring;
        this.introduction = introduction;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScoring() {
        return scoring;
    }

    public void setScoring(String scoring) {
        this.scoring = scoring;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", scoring='" + scoring + '\'' +
                ", introduction='" + introduction + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
