package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class UebungNeunFileWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("testMyTest.txt");
        //ich kann nicht newLine einfügen deswegen muss "\n"
        fileWriter.write("Test \n");
        fileWriter.write("zeile2");

        fileWriter.flush();
        fileWriter.close();
    }
}
