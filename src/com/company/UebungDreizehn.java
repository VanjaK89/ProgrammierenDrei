package com.company;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UebungDreizehn {
    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        //das ist jetzt byte ebene
        FileInputStream fileInputStream = new FileInputStream(file);  //war früher FileReader
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); //besser lesen können

        int byteRead;
        int character_count = 0;
        int character_count_with = 0;
        while ((byteRead=bufferedInputStream.read()) != -1)   //das es führt bis ungleich minus 1 ist
        {      character_count_with++;

           if(!Character.isWhitespace((char) byteRead)){
               System.out.println((char) byteRead);
                character_count++;
            }
        }
        System.out.println(character_count);
        System.out.println(character_count_with);

        bufferedInputStream.close();

        bufferedInputStream.close();

    }
}
