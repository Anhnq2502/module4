package com.example.book_management.common;

public class OutOfBookException extends Exception{
    public OutOfBookException(String mess){
        super(mess);
    }
}