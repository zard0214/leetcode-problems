package queue.easy;


public class Queue237 {

    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(2);
        Queue237.Solution.ListNode listNode4 = new Queue237.Solution.ListNode(4);
        Queue237.Solution.ListNode listNode3 = new Queue237.Solution.ListNode(1);
        Queue237.Solution.ListNode listNode2 = new Queue237.Solution.ListNode(9);
        Queue237.Solution.ListNode listNode5 = new Queue237.Solution.ListNode(5);
        Queue237.Solution.ListNode listNode22 = new Queue237.Solution.ListNode(2);
        listNode.next = listNode4;
        listNode4.next = listNode3;
        listNode3.next = listNode2;
        int x = 3;
        Solution.deleteNode(listNode);
        System.out.println(listNode);
    }


    static class Solution {
        public static void deleteNode(ListNode node) {
            ListNode next = node.next;
            if(next != null){
                node.val = next.val;
                node.next = next.next;
            }
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
