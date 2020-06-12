package simple.problems;

//  Question - Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//  reverse the number and compare it with the input.

public class Question1 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0, input = x;
        while (x / 10 > 0){
            reverse = (reverse*10) + (x % 10);
            x /= 10;
        }
        reverse = (reverse*10) + (x % 10);
        if (input == reverse) return true;
        return false;
    }
}
