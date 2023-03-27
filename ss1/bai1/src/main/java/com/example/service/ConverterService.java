package com.example.service;


public class ConverterService implements IConverterService {

    @Override
    public double converter(double usd, double rate) {
        double result = usd * rate;
        return result;
    }
}
