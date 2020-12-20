package com.functions;

public class Lfunction {
    public static void main(String[] args) {

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
    private static void runner (Runnable runner) {
        runner.run();
    }

}
