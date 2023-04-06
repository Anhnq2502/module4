package com.example.book_management.common;

public class InvalidCodeException extends Exception{
    public InvalidCodeException(String mess){
        super(mess);
    }
}