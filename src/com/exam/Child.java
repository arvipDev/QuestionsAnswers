package com.exam;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {

    private String name;

    Child(String name){
        super("");
        this.name = name;
    }

    public void print(){
        System.out.println("Child class - " + name);
    }

    public void test() throws IOException {
        throw new FileNotFoundException();
    }

}
