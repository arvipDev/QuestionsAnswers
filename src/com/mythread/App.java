package com.mythread;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        producerConsumer();
    }

    // Only one object can be used per thread
    private static void testOne() {
        Mythread thread = new Mythread();
        thread.start();
        System.out.println("Running on main thread...");
        System.out.println(thread.getName());
        thread.setName("Thread A");
        System.out.println(thread.getName());
    }

    // Same object being used by multiple threads.
    private static void testTwo() {
        Yourthread yourthread = new Yourthread("Arvind");
        Thread thread = new Thread(yourthread);
        thread.start();
        Thread thread2 = new Thread(yourthread);
        thread2.start();
    }

    private static void testThree() {
        Counter counter = new Counter();
        MultiThread thread = new MultiThread(counter);
        thread.start();
        MultiThread thread2 = new MultiThread(counter);
        thread2.start();
    }

    private static void producerConsumer() {
        LinkedList<Integer> questions = new LinkedList<>();
        Producer producer = new Producer(questions);
        Consumer consumer = new Consumer(questions);
        Thread one = new Thread(producer);
        Thread two = new Thread(consumer);

        one.start();
        two.start();
    }
}
