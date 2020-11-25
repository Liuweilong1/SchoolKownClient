package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

public class MyNotification {

    private int id;
    private String name;
    private String noticontent;
    private String time;
    private Bitmap bitmap;

    public MyNotification() {
    }

    public MyNotification(int id, String name, String noticontent, String time, Bitmap bitmap) {
        this.id = id;
        this.name = name;
        this.noticontent = noticontent;
        this.time = time;
        this.bitmap = bitmap;
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

    public String getNoticontent() {
        return noticontent;
    }

    public void setNoticontent(String noticontent) {
        this.noticontent = noticontent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public String toString() {
        return "MyNotification{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noticontent='" + noticontent + '\'' +
                ", time='" + time + '\'' +
                ", bitmap=" + bitmap +
                '}';
    }
}
