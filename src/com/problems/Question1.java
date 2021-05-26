package com.problems;

//  Question - Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//  reverse the number and compare it with the input.

public class Question1 {
    public boolean isPalindrome(int value) {
        int reverseValue = 0;
        int tempValue = value;
        while(tempValue > 0){
            reverseValue = (reverseValue * 10) + (tempValue % 10);
            tempValue /= 10;
        }
        return (reverseValue == value);
    }
}
