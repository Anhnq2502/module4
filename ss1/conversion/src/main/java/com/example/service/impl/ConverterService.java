package com.example.service.impl;


import com.example.service.IConverterService;

public class ConverterService implements IConverterService {

    @Override
    public double converter(double usd, double rate) {
        return usd * rate;
    }
}
