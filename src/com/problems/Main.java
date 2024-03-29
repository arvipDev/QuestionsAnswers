package com.problems;


import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Question1 q1 = new Question1();
        //System.out.println(q1.isPalindrome(121));

/*        Question2 q2 = new Question2();
        System.out.println(q2.romanToInt("XXXIV"));
        System.out.println(q2.romanToInt("LVIII"));
        System.out.println(q2.romanToInt("IX"));
        System.out.println(q2.romanToInt("MCMXCIV"));
        System.out.println(q2.romanToInt("DCXXI"));

        Question3 q3 = new Question3();
        System.out.println(q3.countPrimes(10000));*/

/*        Question7 q4 = new Question7();
        System.out.println(q4.isIsomorphic("foo","bar"));
        System.out.println(q4.isIsomorphic("aa","ab"));
        System.out.println(q4.isIsomorphic("ab","ca"));
        System.out.println(q4.isIsomorphic("ab","aa"));*/

        int[] ar = insertionSort(new int[]{1, 6, 9, 8, 7, 5, 2});
        System.out.println(Arrays.toString(ar));

    }
    static int[] insertionSort (int arr[]){
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j -= 1;
            }
        }
        return arr;
    }

}
