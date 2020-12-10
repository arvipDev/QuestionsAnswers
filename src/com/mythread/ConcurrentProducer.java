package com.mythread;

import java.util.concurrent.BlockingQueue;

@SuppressWarnings("BusyWait")
public class ConcurrentProducer implements Runnable{

    final BlockingQueue<Integer> questions;

    public ConcurrentProducer (BlockingQueue<Integer> questions){
        this.questions = questions;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
                try {
                    System.out.println("Answering question number " + questions.take());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
