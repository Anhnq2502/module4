package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface IMailBoxService {
    public String[] languages();

    public Integer[] pageSizes();
}
