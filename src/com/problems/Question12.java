package com.problems;

//Given an array of integers nums. A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//Return the number of good pairs.
//Constraints: 1 <= nums.length <= 100, 1 <= nums[i] <= 100

public class Question12 {
    public static void main(String[] args) {
        Question12 q12 = new Question12();
        System.out.println(q12.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    // Using an array and formula (n * (n-1)/2) to find the repetition.
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        int[] arr = new int[101];
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
            if (nums[i] > max) max = nums[i];
        }

        for (int value : arr) {
            if (max < 0) return counter;
            counter += (value * (value - 1)) / 2;
            max--;
            System.out.println(counter);
        }
        return counter;
    }

/*  Brute force method - O(N^2)
    public int numIdenticalPairs(int[] nums) {
       int counter = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; --j){
                //System.out.println(nums[i] + " " + nums[j]);
                if (nums[i] == nums[j]) counter++;
                //System.out.println("counter: " + counter);
            }
        }
        return counter;

    } */
}
