package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static Map<Integer,Product> products = new HashMap<>();

    static {
        products.put(1,new Product(1, "Bánh", 10000.0, "Bánh Mỹ Tho"));
        products.put(2,new Product(2, "Kẹo dừa", 5000.0, "Kẹo dừa Bến Tre"));
        products.put(3,new Product(3, "Bò húc", 15000.0, "Bò húc Thái"));
        products.put(4,new Product(4, "String", 10000.0, "String nhân sâm"));
        products.put(5,new Product(5, "Nước suối", 5000.0, "Nuớc suối Aquafina"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getProductID(),product);
    }

    @Override
    public void update(Integer productID,Product product) {
        products.put(productID,product);
    }

    @Override
    public Product findByName(String productName) {
        return products.get(productName);
    }

    @Override
    public void delete(Integer productID) {
        products.remove(productID);
    }

    @Override
    public Product findById(Integer productID) {
        return products.get(productID);
    }
}
