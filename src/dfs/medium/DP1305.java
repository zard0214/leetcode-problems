package dfs.medium;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DP1305 {
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

        Solution.TreeNode treeNode10 = new Solution.TreeNode(10);
        Solution.TreeNode treeNode22 = new Solution.TreeNode(22);
        Solution.TreeNode treeNode18 = new Solution.TreeNode(18);
        Solution.TreeNode treeNode41 = new Solution.TreeNode(41);
        Solution.TreeNode treeNode15 = new Solution.TreeNode(15);
        Solution.TreeNode treeNode16 = new Solution.TreeNode(16);
        Solution.TreeNode treeNode27 = new Solution.TreeNode(27);
        Solution.TreeNode treeNode38 = new Solution.TreeNode(38);
        treeNode10.left = treeNode22;
        treeNode10.right = treeNode3;
        treeNode22.left = treeNode41;
        treeNode22.right = treeNode15;
        treeNode41.left = treeNode27;
        treeNode18.right = treeNode16;
        treeNode16.right = treeNode38;

        System.out.println(Solution.getAllElements(treeNode1, treeNode10));
    }

    static class Solution {

        public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> result = new ArrayList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue();
            doToGst(priorityQueue, root1);
            doToGst(priorityQueue, root2);
            while (!priorityQueue.isEmpty()){
                result.add(priorityQueue.poll());
            }
            return result;
        }

        private static void doToGst(PriorityQueue priorityQueue, TreeNode root) {
            if(root == null)
                return;
            priorityQueue.offer(root.val);
            doToGst(priorityQueue, root.left);
            doToGst(priorityQueue, root.right);
        }

//
//        public static TreeNode bstToGst(TreeNode root) {
//
//            return root;
//        }
//
//        static int sum = 0, level = 0;
//        public static int deepestLeavesSum(TreeNode root) {
//            doLeavesSum(root, 0);
//            return sum;
//        }
//
//        private static void doLeavesSum(TreeNode root, int l) {
//            if(root == null)
//                return;
//            doLeavesSum(root.left,l + 1);
//            doLeavesSum(root.right,l + 1);
//            if(l > level){
//                sum = 0;
//                level = l;
//            }
//            if(l == level){
//                sum += root.val;
//            }
//        }

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
