package com.inheritance;

public interface Int2 extends Int1 {
    void done();

    default void doo(){};
}
