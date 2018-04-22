package com.yasaman.bookstore.BookStore;



public class Author extends User {
    private int BookCount;

    public Author( String Name , String UserName , int bookCount) {
        super(Name, UserName);
        BookCount = bookCount;
    }


    public int getBookCount() {
        return BookCount;
    }


}
