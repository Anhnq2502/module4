package com.example.service;


public class ConverterServiceImpl implements IConverterService {

    @Override
    public double converter(double usd, double rate) {
        double result = usd * rate;
        return result;
    }
}
