package com.example.schoolkownclient.Entities;

import androidx.annotation.NonNull;

public class Activities {
    private int photo;
    private int type;
    private String title;
    private String time;
    private String state;

    public Activities() {
    }

    public Activities(int photo, int type, String title, String time, String state) {
        this.photo = photo;
        this.type = type;
        this.title = title;
        this.time = time;
        this.state = state;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
