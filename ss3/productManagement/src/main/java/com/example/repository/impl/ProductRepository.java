package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"Bánh",10000.0,"Bánh Mỹ Tho"));
        products.add(new Product(2,"Kẹo dừa",5000.0,"Kẹo dừa Bến Tre"));
        products.add(new Product(3,"Bò húc",15000.0,"Bò húc Thái"));
        products.add(new Product(4,"String",10000.0,"String nhân sâm"));
        products.add(new Product(5,"Nước suối",5000.0,"Nuớc suối Aquafina"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
