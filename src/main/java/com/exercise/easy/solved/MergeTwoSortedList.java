package com.exercise.easy.solved;


public class MergeTwoSortedList {

    public static void main(String[] args) {
        // Create nodes of list 1
        ListNode l1N3 = new ListNode(4);
        ListNode l1N2 = new ListNode(2, l1N3);
        ListNode l1N1 = new ListNode(1, l1N2);

        // Create nodes of list 2
        ListNode l2N3 = new ListNode(4);
        ListNode l2N2 = new ListNode(3, l2N3);
        ListNode l2N1 = new ListNode(2, l2N2);

        ListNode node = new MergeTwoSortedList().mergeTwoLists(l1N1, l2N1);
        System.out.println(node);
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

        @Override
        public String toString() {
            return "ListNode{" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
        }
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);

        // Use a fake head
        ListNode p = head;

        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            }
            else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        // If one of the list is empty, then only append the rest to the new merged list
        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return head.next;
    }
}
