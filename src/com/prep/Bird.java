package com.prep;

public class Bird extends Vertebrate implements Mobility {

    public Bird(int age, String terrain) {
        super(age, terrain);
    }

    @Override
    public void move(){
        System.out.println("Flying..");
    }

    @Override
    public void origin() {
        System.out.println("Since this is a bird, evolved to rule the sky");
    }
}
