package com.com19alatoo.webpage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bookName;
    private String author;
    private String type;


    public Books() {}

    public Books(Integer id, String bookName, String author, String type) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return bookName.hashCode() + author.hashCode() + type.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (((Books) obj).getBookName().equals(bookName))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return bookName + "- author: " + author + ", type: " + type;
    }


}
