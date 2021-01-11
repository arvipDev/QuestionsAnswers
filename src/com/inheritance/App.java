package com.inheritance;

import java.util.ArrayList;
import java.util.List;

public class App {

    static int and = 10;
    public static void main(String[] args) {
        //new App().staticVariableCall();
        staticCall();
    }

    private static void staticCall(){
        // static variable in interface being accessable using reference variable
        Z z = new XYZ();
        System.out.println(z.name);
    }

    private void staticVariableCall(){
        System.out.println(this.and);
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
