package com.exercise.recursion;

public class SwapNodesInPair {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newHead = new SwapNodesInPair().swapPairs(head);
        System.out.println(newHead);
    }

    private static class ListNode {

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

        @Override
        public String toString() {
            return "ListNode {" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
        }
    }

    private ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }

    private ListNode swapPair(ListNode head) {
        int i = 0;
        while (head.next != null) {
            if (i % 2 == 0) {

            }
            i++;
        }
        return head;
    }
}

