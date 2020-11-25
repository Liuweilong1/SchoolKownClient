package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

public class MyMessage {
    private int id;
    private String name;
    private String mescontent;
    private String time;
    private Bitmap bitmap;

    public MyMessage() {
    }

    public MyMessage(int id, String name, String mescontent, String time, Bitmap bitmap) {
        this.id = id;
        this.name = name;
        this.mescontent = mescontent;
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

    public String getMescontent() {
        return mescontent;
    }

    public void setMescontent(String mescontent) {
        this.mescontent = mescontent;
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
        return "MyMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mescontent='" + mescontent + '\'' +
                ", time='" + time + '\'' +
                ", bitmap=" + bitmap +
                '}';
    }
}
