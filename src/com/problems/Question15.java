package com.problems;

public class Question15 {

    // Factorial using recursion, time - O(n), space - O(n)

    public int factorial(int num){
        if (num == 0) return 1;
        return (factorial(num - 1) * num);
    }

    // Factorial using loop, time - O(n), space - O(n)

    public int fact(int num){
        int value = 1;
        for (int i = 1; i <= num; i++){
            value *= i;
        }
        return value;
    }

    // Fibonacci using recursion, time - O(2^n), space - O(n)

    public int fibonacci(int num){
        if (num <= 1) return num;
        return (fibonacci(num - 1) + fibonacci(num - 2));
    }

    // Fibonacci using for loop, time - O(n), space - O(n)

    public int fibo(int n){
        int fib1 = 1;
        int fib2 = 1;
        int temp;
        for (int i = 2; i < n; i++){
            temp = fib1;
            fib1 = fib1 + fib2;
            fib2 = temp;
        }
        return fib1;
    }
}
