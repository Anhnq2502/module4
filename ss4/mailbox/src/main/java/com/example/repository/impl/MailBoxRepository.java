package com.example.repository.impl;

import com.example.repository.IMailBoxRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MailBoxRepository implements IMailBoxRepository {
    @Override
    public String[] languages() {
        return new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
    }

    @Override
    public Integer[] pageSizes() {
        return new Integer[]{5, 10, 15, 25, 50, 100};
    }
}
