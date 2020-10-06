package simple.problems;

//  Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
//  We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

public class Question10 {
    public static void main(String[] args) {
        //int[] A = {3,4,2,3};
        //int[] A = {4,2,3};
        //int[] A = {5,7,1,8}; // 4128
        //int[] A = {1,2,3};
        //int[] A = {1,3,2};
        int[] A = {4, 2, 1}; //[-1,4,2,3] //-1443
        Question10 q10 = new Question10();
        System.out.println(q10.checkPossibility(A));
    }

    public boolean checkPossibility(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i+1]) {
                counter++;
                if (i > 0) {
                    if (nums[i-1] <= nums[i+1]){
                        nums[i] = nums[i-1];
                    }else {
                        nums[i+1] = nums[i];
                    }
                }
                if (counter > 1) return false;
            }
        }
        return true;
    }
}
