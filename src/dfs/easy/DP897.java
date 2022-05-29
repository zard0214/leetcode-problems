
package dfs.easy;

import java.util.PriorityQueue;

/**
  @author zard
  @date Created in 30/09/2021 17:01
 */
public class DP897 {
    public static void main(String[] args) {
        Solution.TreeNode root5 = new Solution.TreeNode(5);
        Solution.TreeNode root3 = new Solution.TreeNode(3);
        Solution.TreeNode root6 = new Solution.TreeNode(6);
        Solution.TreeNode root2 = new Solution.TreeNode(2);
        Solution.TreeNode root4 = new Solution.TreeNode(4);
        Solution.TreeNode root1 = new Solution.TreeNode(1);
        Solution.TreeNode root8 = new Solution.TreeNode(8);
        Solution.TreeNode root7 = new Solution.TreeNode(7);
        Solution.TreeNode root9 = new Solution.TreeNode(9);
        root5.left = root3;
        root5.right = root6;
        root3.left = root2;
        root3.right = root4;
        root2.left = root1;
        root6.right = root8;
        root8.left = root7;
        root8.right = root9;

        System.out.println(root5);
        System.out.println(Solution.increasingBST(root5));
    }

    static class Solution {
        public static TreeNode increasingBST(TreeNode root) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(root.val);
            addVal2Pq(pq, root.left);
            addVal2Pq(pq, root.right);
            Solution.TreeNode result = new Solution.TreeNode(pq.poll());
            Solution.TreeNode head = result;
            while (!pq.isEmpty()) {
                result.right = new Solution.TreeNode(pq.poll());
                result = result.right;
            }
            return head;
        }

        private static void addVal2Pq(PriorityQueue<Integer> pq, TreeNode root) {
            if(root != null){
                pq.offer(root.val);
                addVal2Pq(pq, root.left);
                addVal2Pq(pq, root.right);
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
