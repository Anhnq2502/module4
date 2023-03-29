package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface IMailBoxService {
    String[] languages();

    Integer[] pageSizes();
}
