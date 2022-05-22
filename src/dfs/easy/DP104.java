package dfs.easy;

/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP104 {
    public static void main(String[] args) {
        Solution.TreeNode root  = new Solution.TreeNode(2);
        Solution.TreeNode left  = new Solution.TreeNode(3);
        Solution.TreeNode right  = new Solution.TreeNode(4);
        Solution.TreeNode right2  = new Solution.TreeNode(5);
        Solution.TreeNode right3  = new Solution.TreeNode(6);
        root.left = null;
        root.right = left;
        left.left = null;
        left.right = right;
        right.left = right2;
        right.right = right3;
        System.out.println(Solution.minDepth(root));
    }

    static class Solution {

        public static int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            int left = minDepth(root.left);
            left = left > 0 ? left : Integer.MAX_VALUE;
            int right = minDepth(root.right);
            right = right > 0 ? right : Integer.MAX_VALUE;
            return Math.min(left, right) + 1;
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
