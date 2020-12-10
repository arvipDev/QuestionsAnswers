package com.mythread;

public class Yourthread implements Runnable {

    private final String name;

    public Yourthread (String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("This is your thread... " + name);
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
