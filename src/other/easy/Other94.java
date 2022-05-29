package other.easy;



public class Other94 {
    public static void main(String[] args) {
        Solution.TreeNode treeNode1 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode4 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode5 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode6 = new Solution.TreeNode(0);
        Solution.TreeNode treeNode7 = new Solution.TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        int i = Solution.sumRootToLeaf(treeNode1);
        System.out.println(i);
    }


    static class Solution {

        public static int sumRootToLeaf(TreeNode root) {
            int sum = 0;
            if (root != null) {
                sum += root.val;
                sum += postorderTraverse(sum, root.left) +
                        postorderTraverse(sum, root.right);
            }
            return sum;
        }

        public static int postorderTraverse(int sum, TreeNode root) {
            if (root != null) {
                sum += root.val * 2;
                System.out.println("sum :" + sum);
                if(root.left != null){
                    int left = root.left.val * 2;
                    postorderTraverse(left, root.left);
                }else if(root.right != null){
                    int right = root.right.val * 2;
                    right = postorderTraverse(right, root.right);
                }
            }
            return sum;
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
