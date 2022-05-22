package other.easy;


import java.util.ArrayList;
import java.util.List;

public class Other1290 {
    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(1);
        Solution.ListNode listNode2 = new Solution.ListNode(0);
        Solution.ListNode listNode3 = new Solution.ListNode(1);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(listNode);

        Solution.ListNode listNode4 = new Solution.ListNode(0);
        int i = Solution.getDecimalValue(listNode4);
        System.out.println(i);
    }


    static class Solution {
        public static int getDecimalValue(ListNode head) {
            List<Integer> list = new ArrayList<>();
            int index = 1;
            while (head != null){
                list.add(head.val);
                for (int i = 0; i < index - 1; i++) {
                    list.set(i, list.get(i) * 2);
                }
                index ++;
                head = head.next;
            }
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            return sum;
        }

        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }

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
