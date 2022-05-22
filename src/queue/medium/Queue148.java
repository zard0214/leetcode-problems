package queue.medium;


import java.util.PriorityQueue;

public class Queue148 {

    public static void main(String[] args) {
        Solution.ListNode listNode4 = new Solution.ListNode(4);
//        Queue148.Solution.ListNode listNode2 = new Queue148.Solution.ListNode(2);
//        Queue148.Solution.ListNode listNode1 = new Queue148.Solution.ListNode(1);
//        Queue148.Solution.ListNode listNode3 = new Queue148.Solution.ListNode(3);
//        listNode4.next = listNode2;
//        listNode2.next = listNode1;
//        listNode1.next = listNode3;
        Solution.ListNode listNode = Solution.sortList(listNode4);
        System.out.println(listNode);
    }


    static class Solution {
        public static ListNode sortList(ListNode head) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            while (head != null){
                pq.offer(head.val);
                head = head.next;
            }
            ListNode start = head;
            ListNode result = new ListNode(0);
            ListNode result_head = result;
            while (!pq.isEmpty()){
                result.next = new ListNode(pq.poll());
                result = result.next;
            }
            return result_head.next;
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
