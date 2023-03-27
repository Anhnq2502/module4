package com.example.repository;

public class ConverterRepositoryImpl implements IConverterRepository {
    @Override
    public float converter(float usd, float rate) {
        float result = usd * rate;
        return result;
    }
}
