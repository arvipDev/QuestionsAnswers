package com.questions;

    /*  You are given two non-empty linked lists representing two non-negative integers.
        The digits are stored in reverse order and each of their nodes contain a single digit.
        Add the two numbers and return it as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

        Example:

        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.*/


public class Question7 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode();
        ListNode head = ret;
        int carry = 0, x, y, sum;

        while (l1 != null || l2 != null){
            x = (l1 != null) ? l1.val : 0;
            y = (l2 != null) ? l2.val : 0;
            sum = x + y + carry;
            carry = sum / 10;
            ret.next = new ListNode(sum % 10);
            ret = ret.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            ret.next = new ListNode(carry, null);
        }
        return head.next;
    }
}
