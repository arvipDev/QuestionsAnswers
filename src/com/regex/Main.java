package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String input = "The fat cat ran down the street.\nIt was searching for a mouse to eat.";
        test1(input);
    }

    private static void test1(String input){
        String regex = "e{3,5}";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String gp = matcher.group();
            System.out.println(gp);
        }

        // + one or more occurance
        // ? none or one occurance
        // * none or more occurance
        // . anything(1 character) or nothing
        // \\w all alphabets
        // \\w+ all words
        // \\w? all alphabets and spaces
        // \\w* all words and spaces
        // \\s all whitespace
        // \\S all that are not whitespaces
        // \\W all that are not words
        // {number} all matches <= n
        // {number,} all matches > n
        // {number1, number2} all matches between number1 and number2, inclusive.

        System.out.println(input);
    }
}
