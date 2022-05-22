package queue.medium;


public class Queue24 {

    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(1);
        Queue24.Solution.ListNode listNode2 = new Queue24.Solution.ListNode(2);
        Queue24.Solution.ListNode listNode3 = new Queue24.Solution.ListNode(3);
        Queue24.Solution.ListNode listNode4 = new Queue24.Solution.ListNode(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(listNode);
        Solution.ListNode listNode1 = Solution.swapPairs(listNode);
        System.out.println(listNode1);
    }


    static class Solution {

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
