package dfs.medium;


import java.util.ArrayList;
import java.util.List;

public class DP1161 {
    public static void main(String[] args) {
        Solution.TreeNode treeNode1 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode7 = new Solution.TreeNode(7);
        Solution.TreeNode treeNode0 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode77 = new Solution.TreeNode(7);
        Solution.TreeNode treeNode8 = new Solution.TreeNode(-8);
        Solution.TreeNode treeNode81 = new Solution.TreeNode(-1);
        Solution.TreeNode treeNode82 = new Solution.TreeNode(-2);
        treeNode1.left =treeNode7;
        treeNode1.right =treeNode0;
        treeNode7.left =treeNode77;
        treeNode7.right = treeNode8;
        treeNode0.left = treeNode81;
        treeNode0.right = treeNode82;

        System.out.println(treeNode1);
        System.out.println(Solution.maxLevelSum(treeNode1));
    }

    static class Solution {
        public static int maxLevelSum(TreeNode root) {
            List<Integer> maxLine = new ArrayList<>();
            maxLine.add(root.val);
            int i1 = maxLevelSum1(root.left, maxLine) + maxLevelSum1(root.right, maxLine);
            for (int i = 0; i < maxLine.size(); i++) {
                System.out.println("maxLine :" + maxLine.get(i));
            }
            return 0;
        }


        private static int maxLevelSum1(TreeNode root, List<Integer> maxLine) {
            if(root != null){
                if(root.left != null && root.right != null){
                    maxLine.add(root.left.val + root.right.val);
                    return root.left.val + root.right.val;
                }else if(root.left != null && root.right == null){
                    maxLine.add(root.left.val);
                    return root.left.val;
                }else if(root.left == null && root.right != null){
                    maxLine.add(root.right.val);
                    return root.right.val;
                }
            }
            return root.val + root.val;
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
