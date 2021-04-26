package com.exercise.tree;

public class MaximumDepth {

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(7, null, null);
        TreeNode node3 = new TreeNode(15, null, null);
        TreeNode node2 = new TreeNode(20, node3, node4);
        TreeNode node1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, node1, node2);

        System.out.println(root.toString());

        int maxDepth = new MaximumDepth().maxDepth(root);
        System.out.println(maxDepth);
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
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

    private int maxDepth(TreeNode root) {
        return depthFirstSearch(root, 0);
    }

    private int depthFirstSearch(TreeNode node, int currentDepth) {
        if (node == null) return 0;

        currentDepth++;
        return 1 + Math.max(depthFirstSearch(node.left, currentDepth), depthFirstSearch(node.right, currentDepth));
    }

}
