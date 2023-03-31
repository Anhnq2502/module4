package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.BaseRepository;
import com.example.repository.IProductRepository;
import org.hibernate.Session;
import org.hibernate.annotations.NamedQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;
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
        Session session = null;
        Query query = session.createQuery("update Product set productName = :productName, productPrice = :productPrice, productDetail = :productDetail where productID = :productID");
        query.setParameter("productName", product.getProductName());
        query.setParameter("productPrice",product.getProductPrice());
        query.setParameter("productDetail",product.getProductDetail());
        session.update(product);
    }

    @Override
    public List<Product> findByName(String productName) {
        List<Product> productList = Collections.singletonList(BaseRepository.entityManager.find(Product.class, productName));
        return productList;
    }

    @Override
    public void delete(Integer productID) {
        Product product = BaseRepository.entityManager.find(Product.class,productID);
        BaseRepository.entityManager.remove(product);
    }

    @Override
    public Product findById(Integer productID) {
        Product product = BaseRepository.entityManager.find(Product.class, productID);
        return product;
    }
}
