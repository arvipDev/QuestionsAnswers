package com.inheritance;

public class Donn extends BDonn{
    public static void main(String[] args) {
        BDonn bd = new Donn();
        Donn donn = new Donn();
        BDonn don = new BDonn();
        BDonn.run();
        bd.run();
        donn.run();
        don.run();

        bd.namer();
        donn.namer();
        don.namer();

    }
    public static void run(){
        System.out.println("Donn");
    }


}
