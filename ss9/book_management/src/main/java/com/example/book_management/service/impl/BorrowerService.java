package com.example.book_management.service.impl;

import com.example.book_management.model.Borrower;
import com.example.book_management.repository.IBorrowerRepository;
import com.example.book_management.service.IBorrowerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService implements IBorrowerService {
    private final
    IBorrowerRepository borrowerRepository;

    public BorrowerService(IBorrowerRepository borrowerRepository) {
        this.borrowerRepository = borrowerRepository;
    }

    @Override
    public List<Borrower> findAllBorrower() {
        return borrowerRepository.findAll();
    }

    @Override
    public String setCodeBorrower() {
        return String.format("%05d", (int) (Math.random() * 100000));
    }
}