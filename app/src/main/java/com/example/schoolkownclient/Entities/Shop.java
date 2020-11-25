package com.example.schoolkownclient.Entities;

public class Shop {
    private int id;
    private String name;
    private String scoring;
    private String introduction;
    private String picture;

    public Shop() {
    }

    public Shop(int id, String name, String scoring, String introduction, String picture) {
        this.id = id;
        this.name = name;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoring='" + scoring + '\'' +
                ", introduction='" + introduction + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
