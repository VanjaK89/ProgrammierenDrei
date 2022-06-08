package com.company;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UebungZwoelf1 {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        //das ist jetzt byte ebene
        FileInputStream fileInputStream = new FileInputStream(file);  //war früher FileReader
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); //besser lesen können

        int byteRead;
        while ((byteRead=bufferedInputStream.read()) != -1)   //das es führt bis ungleich minus 1 ist
        {
            char[] ch = Character.toChars(byteRead);
            System.out.print
                    (ch);
        }
        bufferedInputStream.close();

    }


}
