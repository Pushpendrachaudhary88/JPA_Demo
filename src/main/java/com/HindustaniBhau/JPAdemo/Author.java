package com.HindustaniBhau.JPAdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  authorId;
    private String noOfBooks;
    public Author(){

    }

    public Author(int authorId, String noOfBooks) {
        this.authorId = authorId;
        this.noOfBooks = noOfBooks;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(String noOfBooks) {
        this.noOfBooks = noOfBooks;
    }
}
