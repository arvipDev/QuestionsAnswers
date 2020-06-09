package com.questions;

import java.util.HashMap;
import java.util.Map;

    //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    //You may assume that each input would have exactly one solution, and array contains only positive integers.

    // Solution: Use Hash maps, 1 For loop, returning array and the target value.
    //           1) Run FOR loop for the entire array.
    //           2) Assign the value: Target - current element to a variable
    //           3) if the hash map does not contain the value "Target", add the current element to the hash map
    //              Since we have to return the indices of the element, assign element value to key and index to value of the hash map.
    //           4) else add current index and the value returned by hash map to the returning array.
    //           5) return the returning array.

public class Question6 {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> container = new HashMap<>();
        int difference;
        for (int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if (!container.containsKey(difference)){
                container.put(nums[i], i);
            } else {
                ret[1] = i;
                ret[0] = container.get(difference);
            }
        }
        return ret;
    }
}
