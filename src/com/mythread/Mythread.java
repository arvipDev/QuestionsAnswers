package com.mythread;

public class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 1 running...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
