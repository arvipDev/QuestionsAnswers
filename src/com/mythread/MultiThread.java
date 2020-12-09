package com.mythread;

public class MultiThread extends Thread{

    Counter counter;

    public MultiThread (Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 25; i++){
            System.out.println(Thread.currentThread().getName() +
                    " " + counter.getNext());
        }
    }
}
