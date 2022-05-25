package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class UebungNeunOutputStreamWritter {
    public static void main(String[] args) throws IOException {

        String data = "EXAMPLE - example"; //wir haben hier characters
        //output ins byte transforms and works with binaäre zahlen

        FileOutputStream fileOutputStream = new FileOutputStream("testT.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();

    }
}
