
package dfs.easy;


/**
  @author zard
  @date Created in 30/09/2021 17:01
 */
public class DP226 {
    public static void main(String[] args) {
        Solution.TreeNode root2 = new Solution.TreeNode(2);
        Solution.TreeNode root1 = new Solution.TreeNode(1);
        Solution.TreeNode root3 = new Solution.TreeNode(3);

        root2.left = root1;
        root2.right = root3;

        System.out.println(Solution.invertTree(root2));
    }

    static class Solution {
        public static TreeNode invertTree(TreeNode root) {
            if(root==null){
                return null;
            }
            if(root.left == null && root.right == null){
                return root;
            }
            TreeNode left = invertTree(root.left);
            TreeNode rigth = invertTree(root.right);
            root.left = rigth;
            root.right = left;
            return root;
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
