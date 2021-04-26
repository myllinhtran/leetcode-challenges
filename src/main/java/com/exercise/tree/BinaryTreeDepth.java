package com.exercise.tree;


/**
 * Write a method that returns the maximum depth of a binary tree.
 * The maximum depth is the number of nodes from the root (inclusive) until the furthest node (inclusive).
 */
public class BinaryTreeDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(11);

        int deep = 1;
        int max = 1;
        max = new BinaryTreeDepth().depthBinaryTree(root, max, deep);
        System.out.println(max);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                   "val=" + val +
                   ", left=" + left +
                   ", right=" + right +
                   '}';
        }
    }

    private Integer depthBinaryTree(TreeNode node, int max, int deep) {

        if (node.left == null && node.right == null) {
            if (deep > max) {
                max = deep;
            }
            return max;
        }
        else {
            max = depthBinaryTree(node.left, max, deep + 1);
            max = depthBinaryTree(node.right, max, deep + 1);
        }
        return max;
    }
}
