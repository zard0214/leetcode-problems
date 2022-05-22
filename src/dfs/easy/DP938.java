package dfs.easy;



public class DP938 {
    public static void main(String[] args) {
        Solution.TreeNode treeNode1 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(2);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(3);
        Solution.TreeNode treeNode4 = new Solution.TreeNode(4);
        Solution.TreeNode treeNode5 = new Solution.TreeNode(5);
        Solution.TreeNode treeNode6 = new Solution.TreeNode(6);
        Solution.TreeNode treeNode7 = new Solution.TreeNode(7);
        Solution.TreeNode treeNode8 = new Solution.TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode4.left = treeNode7;
        treeNode3.right = treeNode6;
        treeNode6.right = treeNode8;
        int low = 2, high = 5;
        System.out.println(Solution.rangeSumBST(treeNode1, low, high));
    }

    static class Solution {

        public static int rangeSumBST(TreeNode root, int low, int high) {
            if(root == null)
                return sum;
            if(root.val >= low && root.val <= high)
                sum += root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
            return sum;
        }

        static int sum = 0, level = 0;
        public static int deepestLeavesSum(TreeNode root) {
            doLeavesSum(root, 0);
            return sum;
        }

        private static void doLeavesSum(TreeNode root, int l) {
            if(root == null)
                return;
            doLeavesSum(root.left,l + 1);
            doLeavesSum(root.right,l + 1);
            if(l > level){
                sum = 0;
                level = l;
            }
            if(l == level){
                sum += root.val;
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
       }
    }
}
