package com.questions;

class Question5 {

    //find the longest palindromic subsequence's length

    // Solution: 1) Create a 2D array NxN where N is the length of the string.
    //           2) In a for loop, assign the value 1 tot he principally diagonal elements of the table
    //           3) Move diagonally above the principally diagonal elements and check the following.
    //              To move diagonally, need 2 FOR loops. The outer FOR loops will give the no of elements to pick (i)
    //              The inner FOR loop will loop from 0 till N - (outer for loop). So the loop does not go out of bound. (j)
    //           4) Head of the subsequence is j. An integer k = i+j to get the tail of the subsequence.
    //           5) If head and tail (charAt j and k) are equal, assign 2 + value at diagonally below/behind element (table[j+1][k-1] + 2).
    //           6) Else assign the max of element directly behind and below.
    //           7) The value at element table[0][length-1] is the value of the longest palindromic subsequence.

    public int longestPalindromeSubseq(String text) {
        int length = text.length();
        int[][] table = new int[length][length];
        for (int i = 0; i < length; i++){
            table[i][i] = 1;
        }
        for (int i = 1; i < length; i++){
            for (int j = 0; j < length - i; j++){
                int k = j+i;
                if (text.charAt(j) == text.charAt(k)){
                    table[j][k] = table[j+1][k-1] + 2;
                } else {
                    table[j][k] = Math.max(table[j][k-1], table[j+1][k]);
                }
            }
        }
        return table[0][length-1];
    }
}
