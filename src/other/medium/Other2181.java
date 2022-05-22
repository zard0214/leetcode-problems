package other.medium;

import queue.medium.Queue24;

import java.util.List;

public class Other2181 {
    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(0);
        Solution.ListNode listNode2 = new Solution.ListNode(3);
        Solution.ListNode listNode3 = new Solution.ListNode(1);
        Solution.ListNode listNode4 = new Solution.ListNode(0);
        Solution.ListNode listNode5 = new Solution.ListNode(4);
        Solution.ListNode listNode6 = new Solution.ListNode(5);
        Solution.ListNode listNode7 = new Solution.ListNode(2);
        Solution.ListNode listNode8 = new Solution.ListNode(0);
        Solution.ListNode listNode9 = new Solution.ListNode(1);
        Solution.ListNode listNode10 = new Solution.ListNode(0);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;
        Solution.ListNode listNode1 = Solution.mergeNodes(listNode);
        System.out.println(listNode1);
    }


    static class Solution {
        public static ListNode mergeNodes(ListNode head) {
            ListNode listNode = null;
            ListNode temporarily;
            ListNode lastNode = head;
            int val = 0;
            while (head.next != null){
                if(head.next.val == 0){
                    temporarily = new ListNode(val);
                    if(listNode == null){
                        listNode = temporarily;
                    }else{
                        if(listNode.next == null){
                            listNode.next = temporarily;
                        }else{
                            listNode = lastNode.next;
                            lastNode = lastNode.next;
                            lastNode.next = temporarily;
                        }
                    }
                    val = 0;
                }else{
                    val += head.next.val;
                }
                head = head.next;
            }
            return listNode;
        }

        public static Solution.ListNode removeElements(Solution.ListNode result, Solution.ListNode head, int val) {
            if (head == null)
                return null;
            if (head.val != val) {
                result.val = head.val;
                result.next = removeElements(head.next, val);
            } else {
                if (head.next == null)
                    if (result.val == 0)
                        return null;
                    else
                        return result;
                else {
                    if (head.val != val) {
                        result.val = head.next.val;
                        result.next = removeElements(head.next.next, val);
                    } else {
                        result = removeElements(head.next, val);
                    }
                }
            }
            if (result == null)
                return null;
            if (result.next != null && result.next.val == 0)
                result.next = null;
            return result;
        }

        public static Solution.ListNode removeElements(Solution.ListNode head, int val) {
            Solution.ListNode result = new Solution.ListNode();
            return removeElements(result, head, val);
        }


        public static class ListNode {
            int val;
            Solution.ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, Solution.ListNode next) {
                this.val = val;
                this.next = next;
            }

            @Override
            public String toString() {
                return "ListNode{" +
                        "val=" + val +
                        ", next=" + next +
                        '}';
            }
        }

    }
}
