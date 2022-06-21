package BinaryProgrammieren3;

import java.io.IOException;

public class ProductDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "newFile.dat";
        Product1 p1 = new Product1("Product 1", 2.00, "Category");
        Product1 p2 = new Product1("Product 2", 2.90, "Category");
        Product1 p3 = new Product1("Product 3", 6.50, "Category");

        ProductManager1 manager = new ProductManager1();
        manager.add(p1);
        manager.add(p2);
        manager.add(p3);

        manager.save(path);
        manager.readFromFile(path);
    }
}
