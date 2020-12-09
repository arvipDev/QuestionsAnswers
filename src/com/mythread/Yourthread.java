package com.mythread;

public class Yourthread implements Runnable {

    private String name = null;

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
