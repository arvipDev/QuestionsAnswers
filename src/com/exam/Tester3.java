package com.exam;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tester3 {

    public static void main(String[] args) {
        q2();
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
