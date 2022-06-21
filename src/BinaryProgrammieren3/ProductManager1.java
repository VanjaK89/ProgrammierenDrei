package BinaryProgrammieren3;

import java.io.*;
import java.util.ArrayList;

public class ProductManager1 {

   private ArrayList<Product1>products = new ArrayList<>();

    public ProductManager1() {
        this.products = products;
    }

    public ArrayList<Product1> getProducts() {
        return products;
    }

    public void add(Product1 p){
        products.add(p);
    }

    public void save(String path) throws IOException, ClassNotFoundException {

        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        System.out.println("Write to file: ");
        for (Product1 p : products) {
            objectOutputStream.writeObject(p.toString());
            System.out.println(p);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Saving done");
    }

    public void readFromFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Product1> productList = new ArrayList<>();

        try {
            Object object;
            while ((object = objectInputStream.readObject()) != null) {
                Product1 p = (Product1) object;
                productList.add(p);
                System.out.println(p);
            }
        } catch (EOFException e) {
            System.out.println("End of File reached.");
        } finally {
            objectInputStream.close();
        }
        System.out.println("FINAL READ Object data: ");
        System.out.println(productList);


    }

}
