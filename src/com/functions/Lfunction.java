package com.functions;

import java.util.function.Predicate;

public class Lfunction {
    public static void main(String[] args) {
        //testOne();
        testFour();
    }
    private static void runner (Runnable runner) {
        runner.run();
    }

    private static void testOne () {
        // Passing an implementation of the interface as an argument to a method whose parameter is of type interface.
        runner(new Human());

        // Anonymous class being passed as an argument. Here the anonymous class is a functional interface, could also be
        // an interface with implemented method.
        runner(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running inside an anonymous class...");
            }
        });

        // Passing a lambda expression instead of anonymous class. This is possible only when the parameter of the method
        // is a functional interface.
        runner(() -> System.out.println("Lambda instead of anonymous class"));

        // Lambda with multiple lines as function definition
        runner(() -> {
            System.out.print("Multiple line lambda function");
            System.out.println(" - Second line");
        });
    }

    private static void testTwo () {
        // Creating an object of the functional interface and assigning a lambda function to it.
        Runnable runner = () -> System.out.println("running...");
        runner.run();
    }

    private static void testThree () {
        // Creating an object of functional interface and assigning a lambda function that takes in an argument of type string.
        Livable live = (s) -> System.out.println(s);
        live.live("I am a survivor..");
    }

    private static void testFour () {
        // Using java generics, lambda function with arguments and return types and functional interface
        Rising<Integer, Integer, String> riser = (t, u) -> {
            int sum = t + u;
            return "Sum of 2 numbers: " + t + " and " + u + " = " + sum;
        };
        System.out.println(riser.rise(5, 10));

        Rising<String, String, String> rising2 = (t, u) -> {
            String fin = t + " " + u;
            return fin;
        };
        System.out.println(rising2.rise("Arvind", "Purushotham"));
    }

}

interface Livable {
    public void live(String string);
}

interface Rising <T, U, V> {
    public V rise(T t, U u);
}