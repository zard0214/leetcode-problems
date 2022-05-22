package dfs.medium;


import java.util.*;

public class DP230 {
    public static void main(String[] args) {
//        [8,3,10,1,6,null,14,null,null,4,7,13]
        Solution.TreeNode treeNode8 = new Solution.TreeNode(8);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(3);
        Solution.TreeNode treeNode10 = new Solution.TreeNode(10);
        Solution.TreeNode treeNode1 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode6 = new Solution.TreeNode(6);
        Solution.TreeNode treeNode14 = new Solution.TreeNode(14);
        Solution.TreeNode treeNode4 = new Solution.TreeNode(4);
        Solution.TreeNode treeNode7 = new Solution.TreeNode(7);
        Solution.TreeNode treeNode13 = new Solution.TreeNode(13);
        treeNode8.left = treeNode3;
        treeNode8.right = treeNode10;
        treeNode10.left = treeNode1;
        treeNode10.right = treeNode6;
        treeNode1.right = treeNode14;
        treeNode14.right = treeNode4;
        treeNode4.right = treeNode7;
        treeNode7.right = treeNode13;
        System.out.println(Solution.maxAncestorDiff(treeNode8));
    }

    static class Solution {
        static int max = -1;
        public static int maxAncestorDiff(TreeNode root) {
            if(root == null) return max;
            doToGst(root);
            return max;
        }

        private static void doToGst(TreeNode root) {
            if(root != null){
                if(root.left != null){
                    if(Math.abs(root.left.val - root.val) > max){
                        max = Math.abs(root.left.val - root.val);
                    }
                }
                if(root.right != null){
                    if(Math.abs(root.right.val - root.val) > max){
                        max = Math.abs(root.right.val - root.val);
                    }
                }
                doToGst(root.left);
                doToGst(root.right);
            }
        }

        public static class TreeNode {
           int val;
           TreeNode left;
           TreeNode right;
           TreeNode() {}
           TreeNode(int val) { this.val = val; }
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
    }
}
