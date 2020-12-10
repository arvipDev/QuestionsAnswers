package com.mythread;

import java.util.concurrent.BlockingQueue;

public class ConcurrentConsumer implements Runnable {

    final BlockingQueue<Integer> questions2;

    public ConcurrentConsumer (BlockingQueue<Integer> questions2){
        this.questions2 = questions2;
    }

    @Override
    public void run() {

    }
}
