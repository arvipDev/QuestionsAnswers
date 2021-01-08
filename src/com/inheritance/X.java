package com.inheritance;

public interface X extends Y, Z{
    default void dosomething(){
        System.out.println("Something");
    }
}
