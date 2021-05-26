package com.inheritance;

import com.generics.Women;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Man {
    public String n = "Public";
    String na = "Package limited";
    private String nam = "No access";
    protected String name = "Arvind Purushotham";

    public static void main(String[] args) {
        //String[] ar = {"Arvind", "Purushotham"};
        //Women.main(ar);
    }

    public static void method1 () {
        float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        System.out.println(var1);
        float var2 = var1 + 1024;
        System.out.println(var2);
        try{
            throw new IOException();
        } catch (IOException e){
            System.out.println("IOException");
        }
    }

    public static void method2() {
        String[] arr= {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if( arrList.removeIf( s -> {
            System.out.print(s);
            return s.length()<=2;})) {
            System.out.println(" removed");
        }
        System.out.println(arrList);
    }
    static double area; int b = 2, h = 3;
    public static void method3() {
        double p, b, h;
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
            area = p * b * h;
        }
        System.out.println("Area is" + area);
    }

    public static void method4(){
        short a = 10;
        int b = 100;
        String s = String.valueOf(a + b);
        long c = (long) a + b;
    }

}
