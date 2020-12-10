package com.mythread;

import java.util.concurrent.BlockingQueue;

public class ConcurrentConsumer implements Runnable {

    final BlockingQueue<Integer> questions;
    private int quest = 0;

    public ConcurrentConsumer (BlockingQueue<Integer> questions){
        this.questions = questions;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
                System.out.println("Asking new Question " + ++quest );
                try {
                    questions.put(quest);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
