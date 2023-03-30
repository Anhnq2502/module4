package com.example.service.impl;

import com.example.model.Product;
import com.example.repository.impl.ProductRepository;
import com.example.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Integer productID,Product product) {
        productRepository.update(productID,product);
    }

    @Override
    public Product findByName(String productName) {
        return productRepository.findByName(productName);
    }

    @Override
    public void delete(Integer productID) {
        productRepository.delete(productID);
    }

    @Override
    public Product findById(Integer productID) {
        return productRepository.findById(productID);
    }
}
