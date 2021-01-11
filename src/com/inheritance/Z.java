package com.inheritance;

public interface Z {

    String name = "Arvind";

    default void dosomething(){
        System.out.println("Z");
    }

    void print();
    static void something(){

    }
    private void some(){

    }
    private static void can(){

    }
    public static void ran(){

    }
}
