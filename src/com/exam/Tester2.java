package com.exam;

import com.database.Tester;

public class Tester2 extends Tester {
    public static void main(String[] args) {
        new Tester2().test();
    }

    private void test() {
        Tester a = new Tester();
        System.out.println(a.i1);
        System.out.println(this.i2);
        System.out.println(super.i2);
    }
}
