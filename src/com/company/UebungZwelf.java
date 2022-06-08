package com.company;

import java.io.*;

public class UebungZwelf {
    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        //das ist jetzt byte ebene
        FileInputStream fileInputStream = new FileInputStream(file);  //war früher FileReader
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); //besser lesen können

        int byteRead;
        while ((byteRead=bufferedInputStream.read()) != -1)   //das es führt bis ungleich minus 1 ist
        {
            System.out.print((char) byteRead);
        }
        bufferedInputStream.close();

    }
}
