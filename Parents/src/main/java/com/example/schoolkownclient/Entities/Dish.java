package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

public class Dish {
    private int id;
    private String name;
    private String standards;
    private String picture;
    private Bitmap dishBitmap;
    private String menuType;

    public Dish() {
    }

    public Dish(int id, String name, String standards, String picture, Bitmap dishBitmap, String menuType) {
        this.id = id;
        this.name = name;
        this.standards = standards;
        this.picture = picture;
        this.dishBitmap = dishBitmap;
        this.menuType = menuType;
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

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getStandards() {
        return standards;
    }

    public void setStandards(String standards) {
        this.standards = standards;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Bitmap getDishBitmap() {
        return dishBitmap;
    }

    public void setDishBitmap(Bitmap dishBitmap) {
        this.dishBitmap = dishBitmap;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standards='" + standards + '\'' +
                ", picture='" + picture + '\'' +
                ", dishBitmap=" + dishBitmap +
                ", menuType='" + menuType + '\'' +
                '}';
    }
}
