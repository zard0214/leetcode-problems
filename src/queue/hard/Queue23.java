package queue.hard;

import java.util.PriorityQueue;

public class Queue23 {

    public static void main(String[] args) {
        Solution.ListNode listNode1 = new Solution.ListNode(1);
        Solution.ListNode listNode4 = new Solution.ListNode(4);
        Solution.ListNode listNode5 = new Solution.ListNode(5);
        Solution.ListNode listNode11 = new Solution.ListNode(1);
        Solution.ListNode listNode3 = new Solution.ListNode(3);
        Solution.ListNode listNode44 = new Solution.ListNode(4);
        Solution.ListNode listNode2 = new Solution.ListNode(2);
        Solution.ListNode listNode6 = new Solution.ListNode(6);

        listNode1.next = listNode4;
        listNode4.next = listNode5;

        listNode11.next = listNode4;
        listNode3.next = listNode44;

        listNode2.next = listNode6;
        Solution.ListNode[] node = {listNode1, listNode11, listNode2};
        Solution.ListNode listNode = Solution.mergeKLists(node);
        System.out.println();
        System.out.println(node[0]);
        System.out.println(node[1]);
        System.out.println(node[2]);
        System.out.println(listNode);
    }


    static class Solution {

        public static ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> pq = new PriorityQueue();
            for (ListNode item: lists
                 ) {
                while (item != null){
                    pq.offer(item.val);
                    item = item.next;
                }
            }
            ListNode before = new ListNode(0);
            ListNode before_head = before;
            while (!pq.isEmpty()){
                before.next = new ListNode(pq.poll());
                before = before.next;
            }
            return before_head.next;
        }

        public static ListNode oddEvenList(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode start = head;

            ListNode before = new ListNode(0);
            ListNode before_head = before;

            ListNode after = new ListNode(0);
            ListNode after_head = after;
            int index = 1;
            while (start != null) {
                if(index % 2 == 1){
                    before.next = start;
                    before = before.next;
                }else{
                    after.next = start;
                    after = after.next;
                }
                index++;
                start = start.next;
            }
            after.next = null;
            before.next = after_head.next;
            after_head.next  = null;
            return before_head.next;
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
