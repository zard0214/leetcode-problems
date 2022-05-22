package queue.hard;



import java.util.*;

public class Queue25 {

    public static void main(String[] args) {
        Solution.ListNode listNode1 = new Solution.ListNode(1);
        Solution.ListNode listNode2 = new Solution.ListNode(2);
        Solution.ListNode listNode3 = new Solution.ListNode(3);
        Solution.ListNode listNode4 = new Solution.ListNode(4);
        Solution.ListNode listNode5 = new Solution.ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        int k  = 3;
        Solution.ListNode listNode = Solution.reverseKGroup(listNode1, k);
        System.out.println(listNode);
    }


    static class Solution {
        public static ListNode reverseKGroup(ListNode head, int k) {
            List<Integer> indicator = new ArrayList<>();
            ListNode start = head;
            ListNode before = new ListNode(0);
            ListNode before_head = before;
            ListNode after = new ListNode(0);
            ListNode after_head = after;
            int index = 0;
            int num = 0;
            while (head != null){
                if(head.val % k == 0){
                    indicator.add(index);
                    num ++;
                }
                head = head.next;
                after.next = start;
                after = after.next;
                index++;
            }
            if(indicator.size() == 0)
                return head;
            else{
                num = 0;
                index = 0;
                Deque<Integer> deque = new ArrayDeque<>();
                while (start != null){
                    deque.addFirst(start.val);
                    if(index == indicator.get(num)){
                        System.out.println(indicator.get(num) + " ");
                        while (!deque.isEmpty()){
                            before.next = start;
                            before = before.next;
                        }
                        if(num < indicator.size() - 1)
                            num++;
                    }
                    start = start.next;
                    index++;
                }
                after.next = null;
                before.next = after_head.next;
                after_head.next  = null;
                return before_head.next;
            }
        }

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
