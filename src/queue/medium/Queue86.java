package queue.medium;


public class Queue86 {

    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(1);
        Queue86.Solution.ListNode listNode4 = new Queue86.Solution.ListNode(4);
        Queue86.Solution.ListNode listNode3 = new Queue86.Solution.ListNode(3);
        Queue86.Solution.ListNode listNode2 = new Queue86.Solution.ListNode(2);
        Queue86.Solution.ListNode listNode5 = new Queue86.Solution.ListNode(5);
        Queue86.Solution.ListNode listNode22 = new Queue86.Solution.ListNode(2);
        listNode.next = listNode4;
        listNode4.next = listNode3;
        listNode3.next = listNode2;
        listNode2.next = listNode5;
        listNode5.next = listNode22;
//        System.out.println(listNode);
        int x = 3;
        Solution.ListNode listNode1 = Solution.partition(listNode, x);
        System.out.println(listNode1);
    }


    static class Solution {
        public static ListNode partition(ListNode head, int x) {
            if (head == null || head.next == null) {
                return head;
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

        public static ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode start = head;
            head = head.next;
            ListNode newTail = null;
            while (start != null && start.next != null) {
                ListNode second = start.next;
                ListNode nextHead = start.next.next;
                start.next = nextHead;
                second.next = start;
                if (newTail != null) {
                    newTail.next = second;
                }
                newTail = start;
                start = nextHead;
            }
            return head;
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
