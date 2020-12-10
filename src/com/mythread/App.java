package com.mythread;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    public static void main(String[] args) {

        producerConsumerTwo();
    }

    // Only one object can be used per thread
    protected static void testOne() {
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

    private static void producerConsumerTwo() {
        BlockingQueue<Integer> questions = new ArrayBlockingQueue<>(5);
        ConcurrentProducer producer = new ConcurrentProducer(questions);
        ConcurrentConsumer consumer = new ConcurrentConsumer(questions);
        Thread one = new Thread(producer);
        Thread two = new Thread(consumer);

        one.start();
        two.start();
    }

}
