package simple.problems;

//  You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
//  Given n, find the total number of full staircase rows that can be formed.
//  n is a non-negative integer and fits within the range of a 32-bit signed integer.

// Solution - k = Square root of (2N + 0.25) + 0.5

public class Question6 {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
}
