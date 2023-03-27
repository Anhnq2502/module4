package com.example.service;

import com.example.repository.ConverterRepositoryImpl;

public class ConverterServiceImpl implements IConverterService {
    ConverterRepositoryImpl repository = new ConverterRepositoryImpl();

    @Override
    public float converter(float usd, float rate) {
        return repository.converter(usd, rate);
    }
}
