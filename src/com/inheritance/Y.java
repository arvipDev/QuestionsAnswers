package com.inheritance;

public interface Y extends Z {
    void dosomething();
    default void print(){}
}
