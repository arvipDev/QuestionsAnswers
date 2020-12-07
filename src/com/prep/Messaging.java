package com.prep;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        //scan();
        //read();
        Trouble trouble = new Trouble();
        try {
            System.out.println(trouble.calculate(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Say something");
        String ans = scan.nextLine();
        System.out.println(ans);
        scan.close();
    }

    private static void read(){
        try {
            File file = new File("data.txt");
            Scanner scan = new Scanner(file);;
            System.out.println("Reading from " + file.getName());
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.length());
            System.out.println(file.getAbsolutePath());
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
