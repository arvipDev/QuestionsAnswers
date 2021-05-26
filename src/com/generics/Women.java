package com.generics;

import com.inheritance.Man;

import java.io.*;
import java.util.Arrays;

public class Women extends Man {
    int a = 100, b = 200;
    static double sum ;
    public static void main(String[] args) {

    }

    public static void testSix() {
        boolean b ;
        b = new Boolean(Boolean.valueOf("1"));
        System.out.println(b);
        b = true;
        System.out.println(b);
        b = new Boolean(null);
        System.out.println(b);
    }

    public static void testFive(){
        int[][] arr= new int[2] [4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};
        for (int[] a : arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void testFour(){
        int[] a = new int[2];
        a[0] = 10;
        a[1] = 20;
        int[] ab = new int[3];
        ab[0] = 10;
        ab[1] = 20;
        ab[2] = 30;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(ab));
        ab = a;
        System.out.println(Arrays.toString(a));
    }

    public static void testThree(){
        Man men = new Women();
        Women women = new Women();
        System.out.println(women.name);
        System.out.println(women.n);
    }

    public static void testTwo(int qq){
        int q = qq;
        int discount = 0;
        int dd = 0;
        discount = (q <= 100) ? ( dd = 5) : (dd = 10);
        System.out.println(discount);
        System.out.println(dd);
        q -= 5;
        System.out.println(q);
        discount = (q >= 100) ? 5 : (q > 80) ? 2 : 0;
        System.out.println(discount);
    }

    public static void testOne(){

        try {
            System.out.println(10/100);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }

        try {
            File fileObj = new File("somename.java");
            FileReader read = new FileReader(fileObj);
            BufferedReader reader = new BufferedReader(read);
            String line = reader.readLine();
            System.out.println(line);
        } catch (Exception e){
            System.out.println(e);
        }

        int a, b;
        if (sum == 0){
            a = 10;
            b = 5;
            sum = a * b * a;
        }
        System.out.println(sum);

        Women women = new Women();
        System.out.println(women.name);
    }
}
