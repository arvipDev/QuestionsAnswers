package com.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lfunction {
    public static void main(String[] args) {
        //testOne();
        testSeven();
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

    private static void testFive () {
        // Using java.util.function package, Predicate functional interface that returns a boolean type.
        // Lambda function assigned to a java provided functional interface Predicate<T>
        Predicate<Integer> predicate = (t) -> t >= 10;
        System.out.println(predicate.test(12));
    }

    private static void testSix () {
        List<Car> cars = Arrays.asList(
                new Car(12000, "Black", 2019, "Ford"),
                new Car(13500, "White", 2002, "BMW"),
                new Car(8000, "Red", 2009, "Mercedes"),
                new Car(23000, "Black", 2016, "Audi"),
                new Car(18000, "White", 2000, "Ford"),
                new Car(9500, "Grey", 1986, "GM")
        );

        Car car = new Car(12000, "Black", 2019, "Ford");

        Predicate<Car> predicate = (c) -> {
            Car car2 = doSomething(cars, car);
            if (car2 == null) {
                System.out.println("No such cars found");
                return false;
            }
            System.out.println(car2.toString());
            return true;
        };
        predicate.test(car);
    }

    private static void testSeven() {
        List<Car> cars = Arrays.asList(
                new Car(12000, "Black", 2019, "Ford"),
                new Car(13500, "White", 2002, "BMW"),
                new Car(8000, "Red", 2009, "Mercedes"),
                new Car(23000, "Black", 2016, "Audi"),
                new Car(18000, "White", 2000, "Ford"),
                new Car(9500, "Grey", 1986, "GM")
        );

        Car car = new Car(12000, "Black", 2019, "Ford");

        // Fetching all cars whose color matches that of the given car.
        CarCondition<List<Car>, Car> carCondition = (t, u) -> {
            for (Car c: t){
                if (c.getColor().equals(u.getColor())){
                    System.out.println(c.toString());
                }
            }
            return false;
        };
        System.out.println(carCondition.test(cars, car));

        // Fetching all cars whose price is greater than given cars price and lesser than 18000
        CarCondition<List<Car>, Car> carCondition2 = (t, u) -> {
            for (Car c: t) {
                if (c.getPrice() <= 18000 && c.getPrice() >= u.getPrice())
                    System.out.println(c.toString());
            }
            return false;
        };
        System.out.println(carCondition2.test(cars, car));
    }

    private static Car doSomething(List<Car> cars, Car car) {
        for (Car c: cars){
            if (c.equals(car))
                return c;
        }
        return null;
    }

}

@FunctionalInterface
interface Livable {
    public void live(String string);
}

@FunctionalInterface
interface Rising <T, U, V> {
    public V rise(T t, U u);
}

@FunctionalInterface
interface CarCondition<T, U> {
    public boolean test(T t, U u);
}