package com.inheritance;

public class Mother {

    public Mother(){
        System.out.println("Default constructor");
    }

    public Mother(String name){
        System.out.println(name + " overloading constructor");
    }

    public static void dumb(){
        System.out.println("Mother class");
    }
}
