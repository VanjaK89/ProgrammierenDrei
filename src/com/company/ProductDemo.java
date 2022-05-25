package com.company;

import java.io.File;
import java.io.IOException;

public class ProductDemo {
    public static void main(String[] args) throws IOException {

        Product p1 = new Product("Cookie", 5.99, "Sweets");
        Product p2 = new Product("Juice", 2.99, "Sweets");
        Product p3 = new Product("Choko", 6.99, "Sweets");

        ProductManager pmg = new ProductManager();
        pmg.add(p1);
        pmg.add(p2);
        pmg.add(p3);

        pmg.saveToFile("data.txt");
        pmg.readFromFile();
    }
}
