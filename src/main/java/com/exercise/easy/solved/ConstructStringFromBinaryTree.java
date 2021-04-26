package com.exercise.easy.solved;

public class ConstructStringFromBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
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

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(4, null, null);
        TreeNode node2 = new TreeNode(3, null, node3);
        TreeNode node1 = new TreeNode(2, null, node2);
        TreeNode root = new TreeNode(1, null, node1);

        String result = new ConstructStringFromBinaryTree().treeToStr(root);
        System.out.println(result);
    }

    private String treeToStr(TreeNode t) {
        if (t == null) return "";
        if (t.left == null && t.right == null) return t.val + "";
        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }
        return t.val + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
    }

    private String tree2str(TreeNode t) {
        if (t == null) return "";
        if (t.left == null && t.right == null) return t.val + "";

        String leftStr = "";
        String rightStr = "";

        if (t.left != null) {
            leftStr = recursiveTree2str(t.left);
        }
        if (t.left == null) {
            leftStr = "()";
        }
        if (t.right != null) {
            rightStr = recursiveTree2str(t.right);
        }
        return t.val + leftStr + rightStr;
    }

    private static String recursiveTree2str(TreeNode t) {
        String str = "";

        if (t.left == null && t.right == null) {
            return "(" + t.val + ")";
        }
        str += "(" + t.val;
        if (t.left != null) {
            str += recursiveTree2str(t.left);
        }
        else {
            str += "()";
        }
        if (t.right != null) {
            str += recursiveTree2str(t.right);
        }
        str += ")";
        return str;
    }


}
