package com.exercise.linkedlist;

public class ConvertBinaryNumberInALinkedListToInteger {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        int result = new ConvertBinaryNumberInALinkedListToInteger().getDecimalValues(head);
        System.out.println(result);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private int getDecimalValue(ListNode head) {
        int nodes = 0; // counter of numbers of nodes in the linked list
        ListNode node = head; // make another reference to head of singly linked list
        while (node != null) { // count the numbers of nodes in the linked list
            nodes++;
            node = node.next;
        }

        int sum = 0;
        while (head != null) {
            if (head.val == 1) {
                sum += Math.pow(2, nodes - 1);
            }
            nodes--;
            head = head.next;
        }
        return sum;
    }

    // Leetcode Solution
    private int getDecimalValues(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null) {
            s.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(s.toString(), 2);
    }

    // Another Leetcode Solution
    private int getDecimalVal(ListNode head) {
        int res = 0;
        while (head != null) {
            res = res * 2;
            res = res + head.val;
            head = head.next;
        }
        return res;
    }
}
