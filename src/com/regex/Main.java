package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //String input = "990 293 0265";
        //"The fat cat ran down the street.\nIt was searching for a mouse to eat. Cod.";
        //test1(input);
        setRegex();
    }

    private static void test1(String input){
        String regex = "\\d+";
                //"(\\d{3})(\\D)?(\\d{3})(\\D)?(\\d{4})";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String gp = matcher.group();
            System.out.println(gp);
        }
        // + one or more occurance
        // ? none or one occurance (optional)
        // * none or more occurance
        // . anything(1 character) or nothing
        // \\w all alphabets
        // \\w+ all words
        // \\w? all alphabets and spaces
        // \\w* all words and spaces
        // \\s all whitespace
        // \\d all digits (one at a time)
        // \\d+ continuous digits
        // \\b is a word boundary, useful to check for words in a sentence.
        // \\S all that are not whitespaces
        // \\W all that are not words
        // \\D all that are not numbers
        // {number} all matches <= n
        // {number,} all matches > n
        // {number1, number2} all matches between number1 and number2, inclusive.
        // [abc]{2,5} atleast 2 should match and max of 5 can match, in any order.
        // (?:) non capturing group

        // (?m) consider multiline string (if string contains multiple line, it will be considered)
        // ^ start of line. must be used with (?m) if multiple lines exist in single string.
        // [^] is a negation (not a "")
        // "(?<=[Tt]he.)\w+" Positive lookbehind - gets the word followed by The|the and a character
        // "(?<![Tt]he.)\w+" Negative lookbehind FYI - "(?<=\\s)\\w+"; = "(?<![a-z])\\w+";
        // "(?=[Tt]he.)\w+" Positive lookahead
        // "(?=![Tt]he.)\w+" Negative lookahead
        // \\1 references the first capturing group. This can be used to check palindrome.

        System.out.println(input);
    }

    public static void setRegex() {
        String input = "My name is Arvind";
        Pattern pattern = Pattern.compile("(name)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
            //System.out.print("Start index " + matcher.start()); // inclusive range value
            //System.out.print(" | End index " + matcher.end()); // exclusive range value
            //System.out.println("");
        }
    }
}
