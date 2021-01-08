package com.inheritance;

public class App {
    public static void main(String[] args) {
        Word.lang();
        Alphabets eng = new English();
        //eng.print();
        //eng.wording();
        eng.dosomething();

        Z z = new XYZ();
        z.dosomething();
        bbb("AAA", "ACC");

    }

    private static void bbb(String... arg) {
        for (String c : arg)
        System.out.println(c);
    }
}
