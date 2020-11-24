package com.example.schoolkownclient.Entities;

import android.graphics.Bitmap;



import java.util.ArrayList;
import java.util.List;

public class Circle {
    private int id;
    private String headPicture;
    private Bitmap headBitMap;
    private String name;
    private String time;
    private String text;
    private List<Bitmap> bitmaps=new ArrayList<>();
    private List<String> pictures=new ArrayList<>();
    private int thumsupNum;
    private List<Comment> comments=new ArrayList<>();

    public Circle() {
    }

    public Circle(int id, String headPicture, Bitmap headBitMap, String name, String time, String text, List<Bitmap> bitmaps, List<String> pictures, int thumsupNum, List<Comment> comments) {
        this.id = id;
        this.headPicture = headPicture;
        this.headBitMap = headBitMap;
        this.name = name;
        this.time = time;
        this.text = text;
        this.bitmaps = bitmaps;
        this.pictures = pictures;
        this.thumsupNum = thumsupNum;
        this.comments = comments;
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

    public Bitmap getHeadBitMap() {
        return headBitMap;
    }

    public void setHeadBitMap(Bitmap headBitMap) {
        this.headBitMap = headBitMap;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Bitmap> getBitmaps() {
        return bitmaps;
    }

    public void setBitmaps(List<Bitmap> bitmaps) {
        this.bitmaps = bitmaps;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public int getThumsupNum() {
        return thumsupNum;
    }

    public void setThumsupNum(int thumsupNum) {
        this.thumsupNum = thumsupNum;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", headPicture='" + headPicture + '\'' +
                ", headBitMap=" + headBitMap +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", text='" + text + '\'' +
                ", bitmaps=" + bitmaps +
                ", pictures=" + pictures +
                ", thumsupNum=" + thumsupNum +
                ", comments=" + comments +
                '}';
    }
}
