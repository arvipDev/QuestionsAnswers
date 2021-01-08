package com.exam;

import java.io.IOException;

public abstract class Parent{

    private String name;

    Parent(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Parent class - " + name);
    }

    protected void doing(){

    }

    public abstract void test() throws IOException;
}
