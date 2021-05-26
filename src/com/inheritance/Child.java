package com.inheritance;

public class Child extends Mother implements Parent {
    public Child (){
        //this("Overloading");
        System.out.println("Constructor");
    }

    public Child(String name){
        super(name);
        System.out.println("Overloading constructor");
    }
}
