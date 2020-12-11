package com.mythread;

public class MessageProcessor implements Runnable {

    private int message;

    public MessageProcessor (int message) {
        this.message = message;
    }

    @Override
    public void run() {

        System.out.println("[MESSAGE] received and is being processed using the thread - " +
                Thread.currentThread().getName() + ", message is ... " + message);
        if (message == 2) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[DONE] message processed. " + Thread.currentThread().getName() +
                " message... " + message);

    }
}
