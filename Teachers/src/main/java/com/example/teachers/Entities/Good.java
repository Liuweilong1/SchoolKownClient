package com.example.teachers.Entities;

import android.content.Intent;

public class Good {
    private int headPhoto;
    private String name;
    private String time;

    public Good() {
    }

    public Good(int headPhoto, String name, String time) {
        this.headPhoto = headPhoto;
        this.name = name;
        this.time = time;
    }

    public int getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(int headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Good{" +
                "headPhoto=" + headPhoto +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
