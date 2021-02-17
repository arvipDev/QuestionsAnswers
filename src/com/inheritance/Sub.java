package com.inheritance;

public class Sub extends Super {
    int sb = 1;
    int com =  20;
    Sub(){
    }
    @Override
    public void orm(){
        System.out.println("Sub orm");
    }

    public void norm(){
        System.out.println("Sub norm");
    }

}
