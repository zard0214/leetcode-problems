package other.easy;


import java.util.List;

public class Other700 {
    public static void main(String[] args) {
        Solution.TreeNode treeNode1 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(2);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        Solution.TreeNode treeNode = Solution.searchBST(treeNode1, 1);
        System.out.println(treeNode);
    }


    static class Solution {

        public static TreeNode searchBST(TreeNode root, int val) {
            TreeNode result = null;
            if(root == null){
                return result;
            }else
                return postorderTraversal(result, root, val);
        }

        public static TreeNode postorderTraverse(TreeNode result, TreeNode root, int val) {
            if (root != null) {
                if(root.val == val){
                    result = root;
                }else {
                    result = postorderTraverse(result, root.left, val);
                    result = postorderTraverse(result, root.right, val);
                }
            }
            return result;
        }

        public static TreeNode postorderTraversal(TreeNode result, TreeNode root, int val) {
            if(root == null)
                return result;
            else{
                return postorderTraverse(result, root, val);
            }
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
