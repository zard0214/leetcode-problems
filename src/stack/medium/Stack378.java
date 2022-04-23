package stack.medium;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author zard
 * @date Created in 22/04/2022 09:28
 */
public class Stack378 {

    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        int k = 1;
        int SS = Stack378.Solution.kthSmallest(matrix, k);
        System.out.println(SS);
    }

    static class Solution {
        public static int kthSmallest(int[][] matrix, int k) {
            int result;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    priorityQueue.offer(matrix[i][j]);
                }
            }
            for (int i = 0; i < k - 1; i++) {
                priorityQueue.poll();
            }
            result = priorityQueue.poll();
            return result;
        }
    }
}
