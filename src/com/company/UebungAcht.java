package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UebungAcht {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String text="";

        while(!text.equals("stop")){
            System.out.println("Enter data: ");
            text=bufferedReader.readLine();
            System.out.println("data is: "+text);
        }

        bufferedReader.close();
        inputStreamReader.close();

//        while((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//            if(line.equals("STOP")){
//                break;
//            }
//        }



    }
}
