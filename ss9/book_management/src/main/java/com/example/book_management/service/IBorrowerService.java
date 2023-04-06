package com.example.book_management.service;

import com.example.book_management.model.Borrower;

import java.util.List;

public interface IBorrowerService {
    List<Borrower> findAllBorrower();

    String setCodeBorrower();
}