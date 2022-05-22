package other.medium;

import java.util.Arrays;


public class Other1721 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        Solution.TreeNode treeNode = new Solution().constructMaximumBinaryTree(nums);
        System.out.println(treeNode);
    }

    static class Solution {
         public class TreeNode {
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

        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if (nums.length == 0) return null;
            int index = maxIndex(nums);
            TreeNode node = new TreeNode(nums[index]);
            node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
            node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index + 1, nums.length));
            return node;

        }

        //search for the max of the index
        public int maxIndex(int[] nums) {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            return index;

        }

    }
}
