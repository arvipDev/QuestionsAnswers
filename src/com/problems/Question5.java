package com.problems;

import java.util.*;

public class Question5 {
/*    public boolean isPalindrome(ListNode head) {

        int number = 0, numberReversed = 0, counter = 0;
        while (head != null) {
            number = (number * 10) + head.val;
            numberReversed += (int) (head.val * Math.pow(10, counter));
            counter++;
            head = head.next;
        }
        return number == numberReversed;
    }*/

/*    public boolean isPalindrome(ListNode head) {
        Stack<Integer> reverse = new Stack<>();;
        while (head != null) {
            reverse.push(head.val);
            head = head.next;
        }
        for (int i = 0; i < reverse.size(); i++){
            if (reverse.pop() != head.val) return false;
            head = head.next;
        }
        return true;
    }*/


    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        //List<Integer> powerfulInt = new ArrayList<>();
        Set<Integer> powerfulInt = new HashSet<>();
        int check = 0;
        for (int i = 0; i <= 19 && Math.pow(x, i) < bound; i++) {
            for (int j = 0; j <= 19 && Math.pow(y, j) < bound; j++){
                check = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (check <= bound){
                    powerfulInt.add(check);
                }
            }
        }
        //powerfulInt.sort((o1, o2) -> o1 < o2 ? o1 : o2);
        return new ArrayList<Integer>(powerfulInt);
    }


}
