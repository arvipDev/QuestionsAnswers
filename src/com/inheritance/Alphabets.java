package com.inheritance;

public class Alphabets implements X, Y, Z {
    @Override
    public void print() {

    }

    @Override
    public void dosomething() {
        System.out.println("Z interface abstract method in Alphabets class");
    }
}
