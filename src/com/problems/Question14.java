package com.problems;

//  Given an array of numbers arr. A sequence of numbers is called an arithmetic progression if the difference
//  between any two consecutive elements is the same.
//Return true if the array can be rearranged to form an arithmetic progression, otherwise, return false.

//      Constraints:
//2 <= arr.length <= 1000
//-10^6 <= arr[i] <= 10^6

import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        Question14 q14 = new Question14();
        //System.out.println(q14.canMakeArithmeticProgression(new int[] {1,2,4}));
        System.out.println(q14.canMakeArithmeticProgression(new int[] {1,5,3}));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++){
            if (arr[i] - arr[i-1] != arr[i-1] - arr[i-2]) return false;
        }
        return true;
    }
}
