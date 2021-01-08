package com.inheritance;

public class App {
    public static void main(String[] args) {
        Word.lang();
        Alphabets eng = new English();
        eng.print();
        //eng.wording();
        eng.dosomething();
    }
}
