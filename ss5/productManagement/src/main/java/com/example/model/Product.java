package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productID;
    @Column(name = "product_name", columnDefinition = "varchar(50)")
    private String productName;
    @Column(name = "product_price")
    private Double productPrice;
    @Column(name = "product_detail")
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
