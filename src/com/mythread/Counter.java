package com.mythread;

import com.sun.source.tree.SynchronizedTree;

public class Counter {
    private int count = 0;

    public int getNext () {
        synchronized (this){
            count++;
            return count;
        }
    }
}
