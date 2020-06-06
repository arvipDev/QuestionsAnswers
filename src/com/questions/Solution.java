package com.questions;

class Solution {


    //LPASPAL
    //babcbab

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