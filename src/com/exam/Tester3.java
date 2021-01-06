package com.exam;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Tester3 {

    public static void main(String[] args) {
        q3();

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
