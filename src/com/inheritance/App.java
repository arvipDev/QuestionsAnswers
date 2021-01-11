package com.inheritance;

public class App {
    public static void main(String[] args) {



    }

    private static void aaa () {
        int aa = 10;
        double bb = 20;
        aa = (int)bb;
        System.out.println(aa);
        byte vv = 8;
        short xx = 10;
        xx = vv;
        System.out.println(xx);
        xx = 1500;
        System.out.println(xx);
        vv = (byte)xx;
        System.out.println(vv);
    }

    private static void bbb(String... arg) {
        for (String c : arg)
        System.out.println(c);
    }
}
