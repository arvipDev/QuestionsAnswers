package simple.problems;

public class Question13 {

    //Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
    //
    //Find the kth positive integer that is missing from this array.

    public static void main(String[] args) {
        Question13 q13 = new Question13();
        System.out.println(q13.findKthPositive(new int[] {1, 2, 3, 6, 11, 12}, 10)); // ans 16
        System.out.println(q13.findKthPositive(new int[] {2,3,4,7,11}, 5)); // ans 9
        System.out.println(q13.findKthPositive(new int[] {2}, 1)); // ans 1
    }

    // best solution - O(N)
    public int findKthPositive(int[] arr, int k) {
        for(int i : arr) if(i <= k) k++;
        return k;
    }

}
