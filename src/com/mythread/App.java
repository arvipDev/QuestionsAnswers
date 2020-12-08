package com.mythread;

public class App {

    public static void main(String[] args) {
        testOne();
    }

    private static void testOne() {
        Mythread thread = new Mythread();
        thread.start();
        System.out.println("Running on main thread...");
        System.out.println(thread.getName());
        thread.setName("Thread A");
        System.out.println(thread.getName());
    }
}
