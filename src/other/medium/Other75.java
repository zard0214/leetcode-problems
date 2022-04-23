package other.medium;

import queue.easy.Queue2099;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author zard
 * @date Created in 21/04/2022 05:11
 */
public class Other75 {
    public static void main(String[] args) {
        int[] s = {2,0,2,1,1,0};
        Other75.Solution.sortColors(s);
    }

    static class Solution {
        public static void sortColors(int[] nums) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int i = 0; i < nums.length; i++) {
                priorityQueue.offer(nums[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = priorityQueue.poll();
            }

        }
    }
}
