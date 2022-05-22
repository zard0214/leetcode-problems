package queue.medium;


public class Queue1721 {

    public static void main(String[] args) {
        int k = 2;
        Solution.ListNode listNode = new Solution.ListNode(1);
        Queue1721.Solution.ListNode listNode2 = new Queue1721.Solution.ListNode(2);
        Queue1721.Solution.ListNode listNode3 = new Queue1721.Solution.ListNode(3);
        Queue1721.Solution.ListNode listNode4 = new Queue1721.Solution.ListNode(4);
        Queue1721.Solution.ListNode listNode5 = new Queue1721.Solution.ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        System.out.println(listNode);
        Solution.ListNode listNode1 = Solution.removeNthFromEnd(listNode, k);
        System.out.println(listNode1);
    }


    static class Solution {
        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode result = new ListNode(0);
            ListNode tmp = result;
            ListNode current = head;
            ListNode front = head;
            ListNode del = head;
            for (int i = 0; i < n; i++) {
                front = front.next;
            }
            System.out.println("front :" + front);
            while (front != null) {
                front = front.next;
                del = del.next;
            }
            System.out.println("front :" + front);
            System.out.println("del :" + del);
            while (current != null) {
                if (current == del) {
                    current = current.next;
                }
                if (current != null) {
                    tmp.next = new ListNode(current.val);
                    tmp = tmp.next;
                    current = current.next;
                }
            }
            return result.next;
        }

        public static ListNode swapNodes(ListNode head, int k) {
            if(head == null) return null;
            ListNode prev = head;
            ListNode curr = head;
            ListNode next = head;
            int length=0;
            while(next != null){
                next = next.next;
                length ++;
            }
            for(int i = 1;i<k;i++){
                prev = prev.next;
            }
            for(int i = 1;i <= length - k;i++){
                curr=  curr.next;
            }

            int temp = prev.val;
            prev.val = curr.val;
            curr.val = temp;
            return head;
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
