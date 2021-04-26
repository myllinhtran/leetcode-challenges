package com.exercise.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // ListNode newHead = new ReverseLinkedList().reverseList(head);
        ListNode newHead = new ReverseLinkedList().reverseList(head);
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

    private ListNode reverseLst(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        if (stack.empty()) return null;

        ListNode node = new ListNode(stack.pop());
        ListNode newHead = node;
        while (!stack.empty()) {
            node.next = new ListNode(stack.pop());
            node = node.next;
        }
        return newHead;
    }

    /*
        While you are traversing the list,
        change the current node's next pointer to point to its previous element.
        Since a node does not have reference to its previous node,
        you must store its previous element beforehand.
        You also need another pointer to store the next node before changing the reference.
        Do not forget to return the new head reference at the end!
     */

    /*
        Flip the direction of the singly linked list
     */
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
