package com.exercise.tree;

public class SearchInBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(11);

        TreeNode node = new SearchInBinarySearchTree().searchBST(root, 3);
        System.out.println(node);
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

    private TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        TreeNode next = null;
        if (root.val > val) {
            if (root.left != null) {
                next = searchBST(root.left, val);
            }
        } else {
            if (root.right != null) {
                next = searchBST(root.right, val);
            }
        }

        return next;
    }
}
