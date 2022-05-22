
package dfs.easy;

import java.util.PriorityQueue;

/**
  @author zard
  @date Created in 30/09/2021 17:01
 */
public class DP617 {
    public static void main(String[] args) {
        Solution.TreeNode root1 = new Solution.TreeNode(1);
        Solution.TreeNode root2 = new Solution.TreeNode(2);
        Solution.TreeNode root3 = new Solution.TreeNode(3);
        Solution.TreeNode root5 = new Solution.TreeNode(5);
        root1.left = root3;
        root1.right = root2;
        root3.left = root5;

        Solution.TreeNode root22 = new Solution.TreeNode(2);
        Solution.TreeNode root21 = new Solution.TreeNode(1);
        Solution.TreeNode root24 = new Solution.TreeNode(4);
        Solution.TreeNode root23 = new Solution.TreeNode(3);
        Solution.TreeNode root27 = new Solution.TreeNode(7);
        root22.left = root21;
        root22.right = root23;
        root21.right = root24;
        root23.right = root27;


        System.out.println(Solution.mergeTrees(root1, root22));
    }

    static class Solution {
        public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null) return root2;
            if (root2 == null) return root1;
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
            return root1;
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
