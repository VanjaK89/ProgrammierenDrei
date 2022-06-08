package com.company;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductManager() {
        this.products = products;
    }

    public void add(Product p){
        products.add(p);
    }
    public void saveToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(Product p: products){
            //ArrayList<Product>pList = new ArrayList<>();    //bez dodatne liste bufferedWriter.write(p.toString()), bufferedWriter.newLine();
            //pList.add(p);

           bufferedWriter.write(p.toString());
           bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void readFromFile() throws IOException {
        FileReader fileReader = new FileReader("data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine()) != null ){
            System.out.println(line);
        }

        bufferedReader.close();

    }



}
