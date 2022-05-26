package other.easy;


import dfs.easy.DP897;
import dfs.medium.DP1161;

import java.util.ArrayList;
import java.util.List;

public class Other94 {
    public static void main(String[] args) {
        Solution.TreeNode treeNode1 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(2);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        System.out.println(treeNode1);
        List<Integer> list = Solution.postorderTraversal(treeNode1);
        System.out.println(list);
    }


    static class Solution {

        public static void postorderTraverse(List<Integer> result, TreeNode root) {
            if (root != null) {
                postorderTraverse(result, root.left);
                postorderTraverse(result, root.right);
                result.add(root.val);
            }
        }

        public static List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if(root == null)
                return result;
            else{
                postorderTraverse(result, root);
            }
            return result;
        }

        private static List<Integer> inorderTraversal2(List<Integer> result, TreeNode root) {
            if(root == null)
                return result;
            if(root.left == null){
                result.add(root.val);
                if(root.right != null){
                    result.add(root.right.val);
                }
            }else{
                inorderTraversal2(result, root.left);
            }
            return result;
        }

        public static class TreeNode {
            int val;
            Solution.TreeNode left;
            Solution.TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, Solution.TreeNode left, Solution.TreeNode right) {
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
