package com.exercise.easy.solved;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode head = new ListNode(1, node2);

        ListNode node = new RemoveDuplicatesFromSortedList().deleteDuplicates(head);
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
            return "ListNode {" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
        }
    }

    /*
        Traverse the list from the head node.
        While traversing, compare each node with its next node.
        If data of next node is the same as the current node, delete the next node.
        But before deleting the next node, we need to store the next pointer of the node,
        so that we can continue traversing the list.
     */
    private ListNode deleteDuplicates(ListNode head) {
        // Make another reference to the head node
        ListNode current = head;

        while (current != null) {
            ListNode temp = current;
            while (temp != null && temp.val == current.val) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
        return head;
    }
}
