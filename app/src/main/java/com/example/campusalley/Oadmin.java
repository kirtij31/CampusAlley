package com.example.campusalley;

public class Oadmin {
    int id;
    String title;

    public Oadmin(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Oadmin() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
