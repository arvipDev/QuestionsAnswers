package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        //testOne();
        //testTwo();
        //testThree();
        testFour();
    }
     private static void testOne() {
        // Stream example 1 - using filter(lambda rep Predicate<String>)
         List<String> strings = Arrays.asList("", "Arvind", "Purushotham", "Sneha", "Bilinti" , "", "Me");
         List<String> filtered = strings.stream()
                 .filter(string -> !string.isEmpty()) //intermediate operation
                 .collect(Collectors.toList());       //termination operation
         filtered.forEach(System.out::println);
         System.out.println(strings.size());
         System.out.println(filtered.size());
     }
     private static void testTwo () {
        // Stream example 2 - using map(lambda)
         List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
         List<Integer> squares = numbers.stream()
                 .map(num ->  {
                     int fin = num * num;
                     fin += num-1;
                     return fin;
                 })
                 .collect(Collectors.toList());
         squares.forEach(System.out::println);
     }

     private static void testThree() {
        //Stream example 3 - .sort() after filtering using filter(lambda)
         List<String> names = Arrays.asList("Apple", "Ball", "Fish", "Dog", "Man", "Cat", "Elephant");
         List<String> alphaSort = names.stream()
                 .filter(s -> s.length() >= 4)
                 .sorted()
                 .collect(Collectors.toList());
         alphaSort.forEach(System.out::println);
     }

     private static void testFour() {
        // Stream example 4 - sorting a custom object
        List<Student> students = Arrays.asList(
                new Student("Alex", 16, "Male"),
                new Student("Ben", 14, "Male"),
                new Student("Zoe", 17, "Female"),
                new Student("Joe", 13, "Male"),
                new Student("Manny", 15, "Female"),
                new Student("Carlos", 16, "Male")
        );

        List<Student> sortedStudents = students.stream()
                .sorted()
                .collect(Collectors.toList());
        sortedStudents.forEach(System.out::println);
     }
}
