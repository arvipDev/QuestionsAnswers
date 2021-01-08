package com.exam;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Tester3 {
    public static void main(String[] args) {
        q9();
    }

    private static void q9(){
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.println(z);
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("aaaa" + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));
    }

    private static void q8(){
        int a = 7;
        boolean bol = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println(bol + " a: " + a);
    }

    private static void q7() {
        List<String> s = new ArrayList<>(4);
        s.add(0, "AAA");
        s.add(4, "BBB");
        System.out.println(s);
    }

    private static void q6() {
        int[] b = new int[2];
        System.out.println(b[0] + " " + b[1]);

        List<Boolean>  bb = new ArrayList<>();
        bb.add(null);
        bb.add(null);
        System.out.println(bb.get(0) + " " + bb.get(1));
    }

    private static void q5(){
        final boolean flag;
        flag = false;
        while (flag){
            System.out.println("Do something");
        }

        double col = 5.7;
        Double dd = 6.7;
        System.out.println(col + " " + dd);
    }

    private static void q4(){
        try {
            System.out.println(1);
        } catch (NullPointerException e){
            System.out.println("A");
        } //catch (FileNotFoundException e){
          //  System.out.println("B");
       // }
    }

    private static void q3() {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s = ":ONE";
        //final String s = new String(":ONE"); //will return false for both.

        String s1 = i1 + s;
        String s2 = i2 + s;

        System.out.println(s1 == "1:ONE");
        System.out.println(s2 == "1:ONE");
        //System.out.println(s2.equals("1:ONE")); // will return true
    }

    private static void q2(){
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(18);
        list.add(50);
        list.removeIf(a -> a % 10 == 0);
        System.out.println(list);
    }

    private static void q1() {
        boolean[] bol = new boolean[2];
        System.out.println(bol[0]);
        System.out.println(bol[1]);
    }
}
