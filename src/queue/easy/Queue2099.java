package queue.easy;


import java.util.*;

/**
 * @author zard
 * @date Created in 22/04/2022 09:45
 */
public class Queue2099 {

    public static void main(String[] args) {
        int[] s = {-1,-2,3,4};
        int k = 3;
        int[] kthLargest = Solution.maxSubsequence(s, k);
        for (int i = 0; i < kthLargest.length; i++)
            System.out.println(kthLargest[i]);
    }

    static class Solution {
        public static int[] maxSubsequence(int[] nums, int k) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            Queue<Integer> stack = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                priorityQueue.offer(nums[i]);
            }
            int[] result = new int[k];
            for (int i = 0; i < nums.length - k; i++) {
                priorityQueue.poll();
            }
            for (int i = 0; i < k; i++) {
//                stack.p(priorityQueue.poll());

            }
            for (int i = 0; i < k; i++) {
//                result[i] =  stack.pop();
            }
            return result;
        }
    }
}
