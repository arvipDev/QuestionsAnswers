package com.mythread;

public class Counter {
    private int count = 0;

    public int getNext () {
        synchronized (this){
            count++;
            return count;
        }
    }
}
