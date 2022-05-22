package queue.easy;


public class Queue234 {

    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(2);
        Queue234.Solution.ListNode listNode4 = new Queue234.Solution.ListNode(4);
        Queue234.Solution.ListNode listNode3 = new Queue234.Solution.ListNode(1);
        Queue234.Solution.ListNode listNode2 = new Queue234.Solution.ListNode(9);
        Queue234.Solution.ListNode listNode5 = new Queue234.Solution.ListNode(5);
        Queue234.Solution.ListNode listNode22 = new Queue234.Solution.ListNode(2);
        listNode.next = listNode4;
        listNode4.next = listNode3;
        listNode3.next = listNode2;
        int x = 3;
        Solution.isPalindrome(listNode);
        System.out.println(listNode);
    }


    static class Solution {
        public static boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            // find middle place
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            // reverse second half
            ListNode oldHeadOfSecondHalf = slow;
            ListNode newHeadOfSecondHalf = reverse(slow);
            ListNode left = head;
            ListNode right = newHeadOfSecondHalf;

            while(right != null) {
                if(left.val != right.val) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            // reverse back second half
            reverse(newHeadOfSecondHalf);
            return true;
        }

        private static ListNode reverse(ListNode head) {
            ListNode last = null;
            ListNode node = head;
            ListNode next = null;
            while(node != null) {
                next = node.next;
                node.next = last;
                last = node;
                node = next;
            }
            return last;
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
