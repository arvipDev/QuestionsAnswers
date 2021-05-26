package com.problems;

//  Question - Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//  Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.


import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public int romanToInt(String s) {
        int current, previous, sum = convertToInt(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++){
            current = convertToInt(String.valueOf(s.charAt(i)));
            previous = convertToInt(String.valueOf(s.charAt(i-1)));
            if (current <= previous) {
                sum += current;
            } else {
                sum = (sum - previous) + (current - previous);
            }
        }
        return sum;
    }

    private int convertToInt (String s) {
        switch (s) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
        }
        return -1;
    }

/*    public int iconvertToInt (String romanNumber){
        int currentInt = substituteInt(String.valueOf(romanNumber.charAt(0)));
        int nextInt;
        int sum = 0;

        for (int i = 0; i < romanNumber.length() - 1; i++){
            nextInt = substituteInt(String.valueOf(romanNumber.charAt(i+1)));

            if(currentInt >= nextInt){
                sum += currentInt;
            } else sum -= currentInt;
            currentInt = nextInt;
        }
        sum += substituteInt(String.valueOf(romanNumber.charAt(romanNumber.length()-1)));
        return sum ;
    }

    public int substituteInt(String romanValue){
        switch(romanValue){
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
        }
        return -1;
    }*/

}
