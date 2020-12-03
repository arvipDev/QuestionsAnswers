package com.exceptions;

import java.io.*;

public class OldApproach {
    public static void main(String[] args) {
        File file = new File("MyData.txt");
        FileReader reader = null;
        BufferedReader buffer = null;
        try {
            reader = new FileReader(file);
            buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            while (line != null){
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read from the buffer");
        } finally {
            try {
                if (file.canExecute()){
                    assert buffer != null;
                    buffer.close();
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Unable to close buffer, probably fine not found");
            }
        }
    }
}
