package com.mythread;

import java.util.LinkedList;

public class Consumer implements Runnable{

    LinkedList<Integer> questions;

    public Consumer (LinkedList<Integer> questions){
        this.questions = questions;
    }

    private void answerQuestions() throws InterruptedException {
        synchronized (questions){
            while (questions.size() != 0){
                System.out.println("Answering the question " + questions.remove(0));
                questions.notify();
            }
        }
        synchronized (questions){
            while (questions.size() == 0) {
                System.out.println("Waiting to receive questions");
                questions.wait();
            }
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                answerQuestions();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
