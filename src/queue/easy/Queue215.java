package queue.easy;

import java.util.PriorityQueue;

/**
 * @author zard
 * @date Created in 22/04/2022 09:45
 */
public class Queue215 {

    public static void main(String[] args) {
        int[] s = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int kthLargest = Solution.findKthLargest(s, k);
        System.out.println(kthLargest);

//        PriorityQueue
    }

    static class Solution {
        public static int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int i = 0; i < nums.length; i++) {
                priorityQueue.offer(nums[i]);
            }
            for (int i = 0; i < nums.length - k; i++) {
                priorityQueue.poll();
            }
            return priorityQueue.poll();
        }
    }
}
