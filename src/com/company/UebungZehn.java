package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UebungZehn {
    public static void main(String[] args) throws IOException {

        File file = new File("testZehn.txt");
        FileWriter fileWriter = new FileWriter(file);

        PrintWriter printWriter = new PrintWriter(fileWriter);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while((line = bufferedReader.readLine()) !=null){

            System.out.println(line);
            if(line.equals("STOP")){
                break;
            }
            printWriter.println(line);
        }
        bufferedReader.close();

        printWriter.flush();
        printWriter.close();
    }
    //while(!(line = bufferedReader.readLine()).equals("STOP"){
    //PrintWriter.println(line);
    //     }
    //bufferedReader.close();
    // printWriter.flush();
    // printWriter.close();
}
