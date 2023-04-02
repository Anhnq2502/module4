package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.BaseRepository;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityTransaction;
import java.util.*;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> findAll() {
        List<Product> productList = BaseRepository.entityManager.createQuery("select p from Product p", Product.class).getResultList();
        return productList;
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public void update(Integer productID, Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Product product1 = findById(productID);
        product1.setProductName(product.getProductName());
        product1.setProductPrice(product.getProductPrice());
        product1.setProductDetail(product.getProductDetail());
        BaseRepository.entityManager.merge(product1);
        entityTransaction.commit();
    }

    @Override
    public List<Product> findByName(String productName) {
        List<Product> productList = Collections.singletonList(BaseRepository.entityManager.find(Product.class, productName));
        return productList;
    }

    @Override
    public void delete(Integer productID) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Product product = findById(productID);
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(Integer productID) {
        Product product = BaseRepository.entityManager.find(Product.class, productID);
        return product;
    }
}
