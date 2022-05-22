package queue.medium;


public class Queue142 {

    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(3);
        Queue142.Solution.ListNode listNode2 = new Queue142.Solution.ListNode(2);
        Queue142.Solution.ListNode listNode3 = new Queue142.Solution.ListNode(0);
        Queue142.Solution.ListNode listNode4 = new Queue142.Solution.ListNode(-4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(listNode);
        Solution.ListNode listNode1 = Solution.detectCycle(listNode);
        System.out.println(listNode1);
    }


    static class Solution {

        public static ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode start = head;
            while (start != null) {

            }
            return head;
        }

        public static ListNode partition(ListNode head, int x) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode start = head;

            ListNode before = new ListNode(0);
            ListNode before_head = before;

            ListNode after = new ListNode(0);
            ListNode after_head = after;

            while (start != null) {
                if(start.val < x){
                    before.next = start;
                    before = before.next;
                }else{
                    after.next = start;
                    after = after.next;
                }
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
