package com.company;

import java.io.Serializable;

public class Product implements Serializable {
    private String ProductName;
    private double Price;
    private String ProductCategory;

    public Product(String productName, double price, String productCategory) {
        ProductName = productName;
        Price = price;
        ProductCategory = productCategory;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }
}
