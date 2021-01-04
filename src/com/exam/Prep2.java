package com.exam;
import com.exceptions.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Prep2 {
    public static void main(String[] args) {
        //q5();
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
        q3(10.0, new Integer(10));
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
