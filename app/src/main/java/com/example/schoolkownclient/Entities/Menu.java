package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int id;
    private String menuType;
    private String typePicture;
    private Bitmap typeBitmap;
    private List<Dish> dishes=new ArrayList<>();

    public Menu() {
    }

    public Menu(int id, String menuType, String typePicture, Bitmap typeBitmap, List<Dish> dishes) {
        this.id = id;
        this.menuType = menuType;
        this.typePicture = typePicture;
        this.typeBitmap = typeBitmap;
        this.dishes = dishes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getTypePicture() {
        return typePicture;
    }

    public void setTypePicture(String typePicture) {
        this.typePicture = typePicture;
    }

    public Bitmap getTypeBitmap() {
        return typeBitmap;
    }

    public void setTypeBitmap(Bitmap typeBitmap) {
        this.typeBitmap = typeBitmap;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuType='" + menuType + '\'' +
                ", typePicture='" + typePicture + '\'' +
                ", typeBitmap=" + typeBitmap +
                ", dishes=" + dishes +
                '}';
    }
}
