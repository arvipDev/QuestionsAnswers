package com.mythread;

import java.util.LinkedList;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) {

        producerConsumerPool();
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
<<<<<<< HEAD
    }

    private static void producerConsumerPool () {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable runnerOne = new MessageProcessor(1);
        executor.submit(runnerOne);
        Runnable runnerTwo = new MessageProcessor(2);
        executor.submit(runnerTwo);
        Runnable runnerThree = new MessageProcessor(3);
        executor.submit(runnerThree);



=======
>>>>>>> 568272b67cbb98eb74c03918d60812be41e19b85
    }

}
