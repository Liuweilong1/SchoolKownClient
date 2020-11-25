package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

public class Studentparent {

    private int id;
    private String name;
    private Bitmap bitmap;
    private String phone;

    public Studentparent() {
    }

    public Studentparent(int id, String name, Bitmap bitmap, String phone) {
        this.id = id;
        this.name = name;
        this.bitmap = bitmap;
        this.phone = phone;
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

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Studentparent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bitmap=" + bitmap +
                ", phone='" + phone + '\'' +
                '}';
    }
}
