package queue.medium;


public class Queue328 {

    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(2);
//        Queue328.Solution.ListNode listNode2 = new Queue328.Solution.ListNode(1);
//        Queue328.Solution.ListNode listNode3 = new Queue328.Solution.ListNode(3);
//        Queue328.Solution.ListNode listNode4 = new Queue328.Solution.ListNode(5);
//        Queue328.Solution.ListNode listNode5 = new Queue328.Solution.ListNode(6);
//        Queue328.Solution.ListNode listNode6 = new Queue328.Solution.ListNode(4);
//        Queue328.Solution.ListNode listNode7 = new Queue328.Solution.ListNode(7);
//        listNode.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;
        System.out.println(listNode);
        Solution.ListNode listNode1 = Solution.oddEvenList(listNode);
        System.out.println(listNode1);
    }


    static class Solution {
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

//        public static ListNode partition(ListNode head, int x) {
//            if (head == null || head.next == null) {
//                return null;
//            }
//            ListNode start = head;
//
//            ListNode before = new ListNode(0);
//            ListNode before_head = before;
//
//            ListNode after = new ListNode(0);
//            ListNode after_head = after;
//
//            while (start != null) {
//                if(start.val < x){
//                    before.next = start;
//                    before = before.next;
//                }else{
//                    after.next = start;
//                    after = after.next;
//                }
//                start = start.next;
//            }
//            after.next = null;
//            before.next = after_head.next;
//            after_head.next  = null;
//            return before_head.next;
//        }

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
