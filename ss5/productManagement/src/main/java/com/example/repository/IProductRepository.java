package com.example.repository;

import com.example.model.Product;
import org.hibernate.annotations.NamedQuery;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void save(Product product);
    void update(Integer productId,Product product);
    List<Product> findByName(String productName);

    void delete(Integer productID);
    Product findById(Integer productID);
}
