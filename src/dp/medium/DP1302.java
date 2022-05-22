
package dp.medium;

import java.util.ArrayList;
import java.util.List;

/**
  @author zard
  @date Created in 30/09/2021 17:01
 */
public class DP1302 {
    public static void main(String[] args) {
        Solution.TreeNode root = new Solution.TreeNode(1);
        Solution.TreeNode left1 = new Solution.TreeNode(2);
        Solution.TreeNode right1 = new Solution.TreeNode(3);
        Solution.TreeNode left2 = new Solution.TreeNode(4);
        Solution.TreeNode left3 = new Solution.TreeNode(5);
        Solution.TreeNode left4 = new Solution.TreeNode(7);
        Solution.TreeNode right2 = new Solution.TreeNode(6);
        Solution.TreeNode right3 = new Solution.TreeNode(8);
        root.left = left1;
        root.right = right1;
        right1.right = right2;
        right2.right = right3;
        left1.left = left2;
        left1.right = left3;
        left2.left = left4;

        System.out.println(root);
        System.out.println(Solution.deepestLeavesSum(root));
    }

    static class Solution {
        public static int deepestLeavesSum(TreeNode root) {
            if(root == null) return 0;
            else if(root != null){
                int sum = 0;
                TreeNode left = root.left;
                TreeNode right = root.right;
                if(left != null){
                    sum += left.val;
                }
                if(right != null){
                    sum += right.val;
                }
                if(left != null || right != null)
                    return deepestLeavesSum2(left, sum) + deepestLeavesSum2(right, sum);
            }
            return 0;
        }

        private static int deepestLeavesSum2(TreeNode root, int sum) {
            if(root != null){
                sum = 0;
                System.out.println("sum :" + sum);
                TreeNode left = root.left;
                TreeNode right = root.right;
                if(left != null){
                    sum += left.val;
                    System.out.println("left.val :" + left.val);
                }
                if(right != null){
                    sum += right.val;
                    System.out.println("right.val :" + right.val);
                }
                System.out.println("sum2 :" + sum);
                if(left != null || right != null)
                    return deepestLeavesSum2(left, sum) + deepestLeavesSum2(right, sum);
            }
            return sum;
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
