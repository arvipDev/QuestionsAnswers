package com.inheritance;

public abstract class Word extends Spelling implements X{
    abstract void wording();
    private void words(){
        System.out.println("Wording");
    }
    public static void lang(){
        System.out.println("Language");
    }
    final void sound(){
        System.out.println("Hard sounds");
    }
    protected void noice(){
        System.out.println("Protected method in abstract class");
    }
    void drum(){
        System.out.println("package-default method in abstract class");
    }
}
