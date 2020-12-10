package com.mythread;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    final LinkedList<Integer> questions;
    final int limit = 5;
    private int counter;

    public Producer (LinkedList<Integer> questions){
        this.questions = questions;
    }

    private void askQuestions() throws InterruptedException {
        synchronized (questions){
            while (questions.size() == limit){
                counter = 0;
                System.out.println("Reached limit, waiting for questions to be answered first");
                questions.wait();
            }
        }
        synchronized (questions){
            questions.add(counter++);
            System.out.println("New question " + questions.getLast());
            questions.notify();
            Thread.sleep(100);
        }
    }


    @Override
    public void run() {
        while (true){
            try {
                askQuestions();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
