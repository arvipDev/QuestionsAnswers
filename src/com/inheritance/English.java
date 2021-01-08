package com.inheritance;

public class English extends Word{
/*    @Override
    public void print() {
        System.out.println("Z interface abstract method in English class");
    }*/

    @Override
    void wording() {
        System.out.println("Word abstract method in English class");
    }

    @Override
    public void dosomething() {
        System.out.println("Z interface abstract method in English class");
    }
}
