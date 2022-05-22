package recursion.medium;


import java.util.ArrayList;
import java.util.List;

public class RECURSION98 {
    public static void main(String[] args) {
        Solution.TreeNode treeNode2 = new Solution.TreeNode(0);
        System.out.println(Solution.isValidBST(treeNode2));
    }

    static class Solution {
        private static TreeNode prev = null;

        public static boolean isValidBST(TreeNode root) {
            if (root == null) return true;

            boolean leftSubTreeValid = isValidBST(root.left);

            if (!leftSubTreeValid) return false;

            if (prev != null && root.val <= prev.val) return false;

            prev = root;

            return isValidBST(root.right);
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
