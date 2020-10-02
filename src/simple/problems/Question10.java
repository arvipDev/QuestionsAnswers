package simple.problems;

//  Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
//  We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

public class Question10 {
    public static void main(String[] args) {
        int[] A = {3,4,2,3};
        //int[] A = {4,2,3};
        //int[] A = {5,7,1,8};
        //int[] A = {1,2,3};
        //int[] A = {1,3,2};
        //int[] A = {4,2,1};
        Question10 q10 = new Question10();
        System.out.println(q10.checkPossibility(A));
    }

    public boolean checkPossibility(int[] nums) {
        int counter = 0;
        int size = nums.length;
        if (size < 3) return true;
        for (int i = 0; i < size - 1; i++){
            counter++;
        }
        return false;
    }
}
