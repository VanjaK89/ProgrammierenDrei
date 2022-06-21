package BinaryProgrammieren3;

import java.io.Serializable;

public class Product1 implements Serializable {

    private String productName;
    private double price;
    private String productCategory;

    public Product1(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}