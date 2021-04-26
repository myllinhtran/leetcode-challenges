package com.exercise.tree;


/**
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest
 * path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 */
public class MinimumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(6, null, null);
        TreeNode node3 = new TreeNode(5, null, node4);
        TreeNode node2 = new TreeNode(4, null, node3);
        TreeNode node1 = new TreeNode(3, null, node2);
        TreeNode root = new TreeNode(2, null, node1);

        int minDepth = new MinimumDepthOfBinaryTree().minDepth(root);
        System.out.println(minDepth);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
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

    private int minDepth(TreeNode root) {
        if (root == null) return 0;

        int minLeft = minDepth(root.left) + 1;
        int minRight = minDepth(root.right) + 1;

        if (root.left == null) return minRight;
        if (root.right == null) return minLeft;

        return Math.min(minLeft, minRight);
    }
}
