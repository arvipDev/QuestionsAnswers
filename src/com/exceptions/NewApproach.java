package com.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NewApproach {
    public static void main(String[] args) {
        testOne();
        testTwo();
    }

    private static void testOne () {
        try(MyCloseable closeable = new MyCloseable()) {
            System.out.println("Do something using MyCloseable class that implements Closeable interface.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testTwo(){
        File file = new File("MyData.txt");
        try {
            try (FileReader reader = new FileReader(file);
                 BufferedReader buffer = new BufferedReader(reader))
            {
                String line = buffer.readLine();
                while (line != null){
                    System.out.println(line);
                    line = buffer.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("File not found, look for File/FileReader object");
        }
    }
}
