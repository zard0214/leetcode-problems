package queue.hard;

import java.util.*;

public class Queue239 {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = Solution.maxSlidingWindow(nums, k);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }


    static class Solution {

        public static int[] maxSlidingWindow(int[] nums, int k) {
            if(nums == null || nums.length == 0) return new int[0];
            LinkedList<Integer> deque = new LinkedList<Integer>();
            int[] res = new int[nums.length + 1 - k];
            for(int i = 0; i < nums.length; i++){
                // 每当新数进来时，如果发现队列头部的数的下标，是窗口最左边数的下标，则扔掉
                if(!deque.isEmpty() && deque.peekFirst() == i - k) deque.poll();
                // 把队列尾部所有比新数小的都扔掉，保证队列是降序的
                while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.removeLast();
                // 加入新数
                deque.offerLast(i);
                // 队列头部就是该窗口内第一大的
                if((i + 1) >= k) res[i + 1 - k] = nums[deque.peek()];
            }
            return res;
        }

//        public static int[] maxSlidingWindow(int[] nums, int k) {
//            if(nums == null || nums.length == 0) return new int[0];
//            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//            int[] res = new int[nums.length + 1 - k];
//            for(int i = 0; i < nums.length; i++){
//                // 把窗口最左边的数去掉
//                if(i >= k) pq.remove(nums[i - k]);
//                // 把新的数加入窗口的堆中
//                pq.offer(nums[i]);
//                // 堆顶就是窗口的最大值
//                if(i + 1 >= k) res[i + 1 - k] = pq.peek();
//            }
//            return res;
//        }

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
