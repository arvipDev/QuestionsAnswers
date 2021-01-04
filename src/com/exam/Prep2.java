package com.exam;
import com.exceptions.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Prep2 {

    public static void main(String[] args) {
        //q8();

    }

    private static void q9(){
        int v1 = 100;
        int v2 = 100;
        Integer v3 = 100;
        Integer v4 = 100;
        System.out.println((v1 == v2) + " " + (v3 == v4));
    }

    private static void q8() {
        LocalDate d1 = LocalDate.parse("1999-01-01");
        LocalDate d2 = LocalDate.parse("1999-01-01");
        LocalDate d3 = LocalDate.of(1999, 1, 1);
        LocalDate d4 = LocalDate.of(1999, 1, 1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println((d1 == d2) + " " + (d2 == d3) + " " + (d3 == d4));
        System.out.println((d1.equals(d2)) + " " + (d2.equals(d3)) + " " + (d3.equals(d4)));
        System.out.println((d1.isEqual(d2)) + " " + (d2.isEqual(d3)) + " " + (d3.isEqual(d4)));
    }

    private static void q7(){
        List<Integer> i = new ArrayList<>();
        i.add(100);
        i.add(200);
        i.add(100);
        i.add(200);
        i.remove(new Integer(100));
        System.out.println(i);
    }

    private static void q6(){
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.add("Y");
        list.add("X");
        System.out.println(list.size());
        list.remove(new String("Y"));
        System.out.println(list);
    }

    private static void q5(){
        LocalDate yearOne = LocalDate.of(2018, 1, 1);
        LocalDate yearTwo = LocalDate.of(2018, 1, 1);
        System.out.println(yearOne.isBefore(yearTwo));
        System.out.println(yearOne.isAfter(yearTwo));
        System.out.println(yearOne.minusYears(-5));
    }

    private static void q4(){
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.remove(0) + " " + list.remove(null));
    }

    private static void q3(){
        q3(10.0, 10);
    }
    private static void q3(Double d1, Double d2){
        System.out.println("Double " + (d1 + d2));
    }
    private static void q3(double d1, double d2){
        System.out.println("double " + (d1 + d2));
    }

    private static void q2(){
        LocalDate date = LocalDate.of(2000, 01, 01);
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period));
    }

    private static void q1(){
        // Widening casting (Auto) and Narrowing casting(Manual).
        char os = 'Z';
        int i = 9_2;
        long j = 100_001;
        double d = 10_0.35d;
        float f = 100_0f;
        System.out.println(i);
        System.out.println(j);

        j = os + j;
        System.out.println(j);

        i = (int)d;
        System.out.println(i);

        i = (int)f;
        System.out.println(i);

        i = (int)d;
        System.out.println(i);

        d = j * i * os;
        System.out.println(d);

        f = j;
        System.out.println(f);

        f = (float) (i * j * d);
        System.out.println(f);
    }
}
