package com.inheritance;

public interface Z {

    void print();
    default void dosomething(){
        some();
    }
    static void something(){

    }
    private void some(){

    }
}
