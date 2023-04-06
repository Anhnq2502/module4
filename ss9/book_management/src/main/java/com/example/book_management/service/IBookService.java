package com.example.book_management.service;

import com.example.book_management.model.Book;
import com.example.book_management.model.Borrower;
import com.example.book_management.common.InvalidCodeException;
import com.example.book_management.common.OutOfBookException;

import java.util.List;

public interface IBookService {
    List<Book> findAllBook();

    boolean borrowerBook(Borrower borrower) throws OutOfBookException;

    boolean returnBook(String code) throws InvalidCodeException;
}
