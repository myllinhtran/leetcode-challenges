package com.exercise.tree;

public class NumberOfTreeNodes {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(6);
        root.right.left.left = new TreeNode(5);
        root.right.left.right = new TreeNode(8);
        root.right.right = new TreeNode(11);

        int result = new NumberOfTreeNodes().getNumberOfNodes(root);
        System.out.println(result);
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

    private int getNumberOfNodes(TreeNode node) {
        int countNodes = 0;
        if (node.right == null && node.left == null) {
            return countNodes;
        }
        countNodes += 1 + getNumberOfNodes(node.left);
        countNodes += 1 + getNumberOfNodes(node.right);

        return countNodes;
    }
}
