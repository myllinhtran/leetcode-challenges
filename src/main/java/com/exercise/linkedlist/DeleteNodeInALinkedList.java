package com.exercise.linkedlist;


public class DeleteNodeInALinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);

        ListNode node1 = new ListNode(5);
        head.next = node1;

        ListNode node2 = new ListNode(1);
        head.next.next = node2;

        ListNode node3 = new ListNode(9);
        head.next.next.next = node3;

        DeleteNodeInALinkedList list = new DeleteNodeInALinkedList();
        list.deleteNode(node1);
        System.out.println(head);
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode {" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
        }
    }

    private void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
