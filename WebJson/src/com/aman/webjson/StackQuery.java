package com.aman.webjson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by aman1 on 10/09/2017.
 */
public class StackQuery {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("hello");
        BufferedReader reader = new BufferedReader(file);
        String data;
        while((data = reader.readLine()) != null){
            System.out.println(data);
        }

        reader.close();
    }


}
