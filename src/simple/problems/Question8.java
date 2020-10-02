package simple.problems;

//  In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
//  Return the element repeated N times.

import java.sql.Array;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.*;

public class Question8 {

    public static void main(String[] args) {
        //int[] A = {1,2,3,3};
        //int[] A = {12,62,62,30,62,96,97,62,62,6,73,62,62,5,62,8,64,62,18,62};
        //int[] A = {1, 2, 3, 4, 5, 6, 4, 4, 4, 4};
        int[] A = {9,5,6,9};
        Question8 q8 = new Question8();
        System.out.println(q8.repeatedNTimes(A));
    }

    // This solution works for small arrays.
/*  public int repeatedNTimes(int[] A) {
        double in = System.currentTimeMillis();
        int size = A.length;
        int number = A[0];
        int backtrack;

        for (int i = 1; i < size; i++){
            number *= 10;
            number += A[i];
            backtrack = number;
            while (backtrack != A[0] ) {
                if (A[i] == (backtrack / 10) % 10) {
                    double out = System.currentTimeMillis();
                    System.out.println("In: " + in );
                    System.out.println("Out: " + out);
                    System.out.println("Process time: " + (out - in));
                    return A[i];
                }
                else backtrack /= 10;
            }
        }
        return 0;
    }*/

/*    //O[N^2]
    public int repeatedNTimes(int[] A) {
        int endAt = (A.length / 2) + 1;
        int temp;
        for (int i = 0; i <= endAt; i++){
            temp = A[i];
            for (int j = 0; j <= endAt; j++){
                if (temp == A[j] && i != j) return A[j];
            }
        }
        return 0;
    }*/

    //O(NlogN)
    public int repeatedNTimes(int[] A) {
        if (A[0] == A[A.length-1]) return A[0];
        for (int i = 1; i <= 2; i++){
            for (int j = 0; j < A.length - i; j++){
                if (A[j] == A[i+j]) return A[j];
            }
        }
        return 0;
    }
}
