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

    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }
}
