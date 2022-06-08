package com.company;

import java.io.*;

public class UebungVierzehn {
    public static void main(String[] args) throws IOException {

        File file = new File("binary_test.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String outputText = "This is a new test.";
        for (char c: outputText.toCharArray()){
            bufferedOutputStream.write(c);
            System.out.print(c);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

    }

}
