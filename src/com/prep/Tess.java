package com.prep;

public interface Tess {

    public static void dd(){
        System.out.println("Static method");
    }

    default void nand(){
        System.out.println("nand");
        dd();
    }
}
