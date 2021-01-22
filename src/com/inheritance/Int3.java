package com.inheritance;

public interface Int3 extends Int2  {
    default void done() {
        System.out.println("In interface 3");
    }

    void doo();
}
