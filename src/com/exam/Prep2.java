package com.exam;

public class Prep2 {
    public static void main(String[] args) {
        q1();
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

    private static void q2(){}
}
