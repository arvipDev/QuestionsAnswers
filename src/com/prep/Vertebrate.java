package com.prep;

public class Vertebrate {
    int age;
    String terrain;

    public Vertebrate(int age, String terrain) {
        this.age = age;
        this.terrain = terrain;
    }

    public void origin() {
        System.out.println("Evolved from amoeba");
    }
}
