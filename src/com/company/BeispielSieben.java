package com.company;

import java.io.*;

public class BeispielSieben {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("test.txt"));


        String line;
        while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

         bufferedReader.close();
        }

//        int c;
//        while((c = fileReader.read()) != -1){
//            char character = (char) c;
//        System.out.println(line);
    }


