package com.example.model;


public class Product {
    private Integer productID;
    private String productName;
    private Double productPrice;
    private String productDetail;

    public Product() {
    }

    public Product(Integer productID, String productName, Double productPrice, String productDetail) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDetail = productDetail;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
}
