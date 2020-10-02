package simple.problems;

// Given the array of integers nums, you will choose two different indices i and j of that array.
// Return the maximum value of (nums[i]-1)*(nums[j]-1).

public class Question9 {
    public static void main(String[] args) {
        //int[] A = {3,4,5,2};
        int[] A = {1,5,4,5};
        Question9 q9 = new Question9();
        System.out.println(q9.maxProduct(A));
    }

    public int maxProduct(int[] nums) {
        int size = nums.length;
        int maxOne = 0;
        int maxOneIndex = 0;
        int maxTwo = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] > maxOne) {
                maxOne = nums[i];
                maxOneIndex = i;
            }
        }
        for (int j = 0; j < size; j++) {
            if (nums[j] > maxTwo && j != maxOneIndex) maxTwo = nums[j];
            if (nums[j] > maxTwo && nums[j] < maxOne) maxTwo = nums[j];
        }
        return ((maxOne - 1) * (maxTwo - 1));
    }
}
