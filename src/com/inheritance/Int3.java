package com.inheritance;

public interface Int3 extends Int2  {
    default void done() {
        System.out.println("In interface 3");
    }

    static void dodo(){
        System.out.println("In interface 3");
    }

    default void didi(){
        System.out.println("In imterface 3");
    }

}
