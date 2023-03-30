package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    void update(Integer productID,Product product);
    Product findByName(String productName);
    void delete(Integer productID);
    Product findById(Integer productID);
}
