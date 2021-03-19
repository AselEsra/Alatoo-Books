package com.com19alatoo.webpage;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Integer id) {
        super("Could not find the book " + id);
    }
}
