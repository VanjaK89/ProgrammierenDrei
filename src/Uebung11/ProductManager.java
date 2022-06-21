package Uebung11;

import java.io.*;
import java.util.ArrayList;

    public class ProductManager {
        ArrayList<Product> productList = new ArrayList<>();

        public void add(Product p) {
            productList.add(p);
        }

        public void saveToFile(String filepath) throws IOException {
            File file = new File(filepath);
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : productList) {
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

            System.out.println("Product Information successfully saved.");
        }

        public void readFromFile(String filepath) throws IOException {

            FileReader fileReader = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Product Information successfully read.");
        }



    }
