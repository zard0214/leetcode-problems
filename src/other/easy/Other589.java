package other.easy;


import java.util.ArrayList;
import java.util.List;

public class Other589 {
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
        System.out.println(Solution.postorder(root));
    }


    static class Solution {
        //root = [1,null,3,2,4,null,5,6]
        //[1,3,5,6,2,4]
        public static List<Integer> postorder(Node root) {
            List<Integer> postorder = new ArrayList<>();
            return postorder(postorder, root);
        }

        private static List<Integer> postorder(List<Integer> postorder, Node root) {
            if(root == null)
                return postorder;
            else{
                List<Node> children = root.children;
                if(children != null){
                    for (int i = 0; i < children.size(); i++) {
                        postorder(postorder, children.get(i));
                    }
                }
                postorder.add(root.val);
                return postorder;
            }
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
