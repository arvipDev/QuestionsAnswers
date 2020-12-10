package com.mythread;

public class MessageProcessor implements Runnable {

    private int message;

    public MessageProcessor (int message) {
        this.message = message;
    }

    @Override
    public void run() {

        System.out.println("[MESSAGE] received and is being processed..."+ message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[DONE] message processed. ");

    }
}
