package com.company;

import java.io.*;

public class UebuSiebenStreamReader {
    public static void main(String[] args) throws IOException {

        InputStream stream = new FileInputStream("test.txt");
        Reader reader = new InputStreamReader(stream);

        int c;
        while((c = reader.read()) != -1){
            System.out.print((char) c);
        }

        reader.close();
    }
}
