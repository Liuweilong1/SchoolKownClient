package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;

public class Comment {
    private int id;
    private String headPicture;
    private String name;
    private String context;
    private Bitmap headBitmap;
    private String time;

    public Comment() {
    }

    public Comment(int id, String headPicture, String name, String context, Bitmap headBitmap, String time) {
        this.id = id;
        this.headPicture = headPicture;
        this.name = name;
        this.context = context;
        this.headBitmap = headBitmap;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Bitmap getHeadBitmap() {
        return headBitmap;
    }

    public void setHeadBitmap(Bitmap headBitmap) {
        this.headBitmap = headBitmap;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", headPicture='" + headPicture + '\'' +
                ", name='" + name + '\'' +
                ", context='" + context + '\'' +
                ", headBitmap=" + headBitmap +
                ", time='" + time + '\'' +
                '}';
    }
}
