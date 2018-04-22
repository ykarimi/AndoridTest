package com.yasaman.bookstore.BookStore;


import java.util.ArrayList;

public class Book {
    private String Title;
    private ArrayList<Author> authors;

    public Book(String title, ArrayList<Author> authors) {
        Title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return Title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }
}
