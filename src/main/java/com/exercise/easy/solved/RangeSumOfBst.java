package com.exercise.easy.solved;


public class RangeSumOfBst {

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(18);
        TreeNode node2 = new TreeNode(15, null, node5);

        TreeNode node4 = new TreeNode(7);
        TreeNode node3 = new TreeNode(3);

        TreeNode node1 = new TreeNode(5, node3, node4);
        TreeNode root = new TreeNode(10, node1, node2);

        System.out.println(root);
        RangeSumOfBst rangeSumOfBst = new RangeSumOfBst();
        int result = rangeSumOfBst.rangeSumBST(root, 7, 15);
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

    private int sum;
    private int rangeSumBST(TreeNode root, int L, int R) {
        sum = 0;
        deptFirstSearch(root, L, R);
        return sum;
    }

    private void deptFirstSearch(TreeNode node, int L, int R) {
        if (node != null) {
            // base case
            // if the node.val satisfies the conditions, sum the value
            // if it doesn't, check the value whether it falls to which sides of the conditions
            // traverse to the nodes of that side, repeat the same process
            if (L <= node.val && node.val <= R) {
                sum += node.val;
            }
            if (L < node.val) {
                deptFirstSearch(node.left, L, R);
            }
            if (R > node.val) {
                deptFirstSearch(node.right, L, R);
            }
        }
    }
}
