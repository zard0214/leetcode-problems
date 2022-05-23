package other.medium;


import java.util.ArrayList;
import java.util.List;

public class Other429 {
    public static void main(String[] args) {
//        1,null,3,2,4,null,5,6
        Solution.Node root = new Solution.Node(1);
        List<Solution.Node> list = new ArrayList<>();
        Solution.Node node3 = new Solution.Node(3);
        Solution.Node node2 = new Solution.Node(2);
        Solution.Node node4 = new Solution.Node(4);
        list.add(node3);
        list.add(node2);
        list.add(node4);
        root.children = list;

        List<Solution.Node> list2 = new ArrayList<>();
        Solution.Node node5 = new Solution.Node(5);
        Solution.Node node6 = new Solution.Node(6);
        list2.add(node5);
        list2.add(node6);

        root.children.get(0).children = list2;

        System.out.println(root);
        System.out.println(Solution.levelOrder(root));
    }


    static class Solution {
        //root = [1,null,3,2,4,null,5,6]
        //[[1],[3,2,4],[5,6]]
        public static List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if(root == null)
                return null;
            else{
                List<Integer> level1 = new ArrayList<>();
                level1.add(root.val);
                result.add(level1);
                return levelOrder(result, root.children);
            }
        }

        private static List<List<Integer>> levelOrder(List<List<Integer>> result, List<Node> root) {
            if(root != null){
                List<Integer> leveln = new ArrayList<>();
                if(root.size() != 0){
                    for (int i = 0; i < root.size(); i++) {
                        leveln.add(root.get(i).val);
                    }
                    result.add(leveln);
                }
                for (int i = 0; i < root.size(); i++) {
                    if(root.get(i).children != null){
                        levelOrder(result, root.get(i).children);
                    }
                }
            }
            return result;
        }

        // Definition for a Node.
        static class Node {
            public int val;
            public List<Node> children;

            public Node() {}

            public Node(int _val) {
                val = _val;
            }

            public Node(int _val, List<Node> _children) {
                val = _val;
                children = _children;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "val=" + val +
                        ", children=" + children +
                        '}';
            }
        }

    }
}
