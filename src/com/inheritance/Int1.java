package com.inheritance;

public interface Int1 {

    static void doo(){
        System.out.println("In interface 1");
    }

    default void done() {
        System.out.println("In interface 1");
    }


}
