package com.example.campusalley;

import java.io.Serializable;

public class CurrentUser implements Serializable {
    int id;
    String email;
    String name;

    public CurrentUser(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public CurrentUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
