package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class UebungNeunOutputStreamWritter {
    public static void main(String[] args) throws IOException {

        String data = " ä ö ü EXAMPLE - example"; //wir haben hier characters
        //output ins byte transforms and works with binaäre zahlen

        FileOutputStream fileOutputStream = new FileOutputStream("testT.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);

        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();

    }
}
