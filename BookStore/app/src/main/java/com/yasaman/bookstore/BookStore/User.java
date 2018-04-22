package com.yasaman.bookstore.BookStore;


import java.security.PrivateKey;

public class User {
    private String name;
    private String UserName;

    public User(String name, String userName) {
        this.name = name;
        UserName = userName;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return UserName;
    }
}
