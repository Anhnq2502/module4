package com.example.cart.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public boolean checkItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    public Map.Entry<Product, Integer> selectItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItemInCart(product)) {
            this.products.put(product, 1);
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            assert itemEntry != null;
            Integer newQuantity = itemEntry.getValue() + 1;
            this.products.replace(itemEntry.getKey(), newQuantity);
        }
    }

    public void removeProduct(Product product) {
        if (!checkItemInCart(product)) {
            return;
        }
        Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
        assert itemEntry != null;
        this.products.remove(itemEntry.getKey());
    }

    public boolean removeAllProduct() {
        if (this.products.isEmpty()) {
            return false;
        }
        this.products.clear();
        return true;
    }

    public void decreaseQuantity(Product product) {
        if (!checkItemInCart(product)) {
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            assert itemEntry != null;
            if (itemEntry.getValue() == 1) {
                removeProduct(itemEntry.getKey());
                return;
            }
            Integer newQuantity = itemEntry.getValue() - 1;
            this.products.replace(itemEntry.getKey(), newQuantity);
        }
    }

    public Integer countProductQuantity() {
        Integer productQuantity = 0;
        for (Map.Entry<Product, Integer> entry : this.products.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity() {
        return this.products.size();
    }

    public Float countTotalPayment() {
        float payment = 0;
        for (Map.Entry<Product, Integer> entry : this.products.entrySet()) {
            payment += entry.getKey().getPrice() * entry.getValue();
        }
        return payment;
    }
}