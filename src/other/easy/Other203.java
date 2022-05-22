package other.easy;


public class Other203 {
    public static void main(String[] args) {
        Solution.ListNode listNode = new Solution.ListNode(7);
        Solution.ListNode listNode2 = new Solution.ListNode(7);
        Solution.ListNode listNode3 = new Solution.ListNode(7);
        Solution.ListNode listNode4 = new Solution.ListNode(7);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(listNode);
        int num2 = 7;
        Solution.ListNode listNode1 = Solution.removeElements(listNode, num2);
        System.out.println(listNode1);
    }


    static class Solution {
        public static ListNode removeElements(ListNode result, ListNode head, int val) {
            if(head == null)
                return null;
            if(head.val != val){
                result.val = head.val;
                result.next =  removeElements(head.next, val);
            }else{
                if(head.next == null)
                    if(result.val == 0)
                        return null;
                    else
                        return result;
                else{
                    if(head.val != val) {
                        result.val = head.next.val;
                        result.next = removeElements(head.next.next, val);
                    }else {
                        result = removeElements(head.next, val);
                    }
                }
            }
            if(result == null)
                return null;
            if(result.next != null &&result.next.val == 0)
                result.next = null;
            return result;
        }

        public static ListNode removeElements(ListNode head, int val) {
            ListNode result = new ListNode();
            return removeElements(result, head, val);
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
