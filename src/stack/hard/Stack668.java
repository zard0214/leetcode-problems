package stack.hard;

import java.util.PriorityQueue;

/**
 * @author zard
 * @date Created in 22/04/2022 09:28
 */
public class Stack668 {

    public static void main(String[] args) {
        int m = 9895, n = 28405, k = 100787757;
        int SS = Stack668.Solution.findKthNumber(m, n, k);
        System.out.println(SS);
    }

    static class Solution {
        public static int findKthNumber(int m, int n, int k) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            int matrix[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (i + 1)* (j + 1);
                    priorityQueue.offer(matrix[i][j]);
                }
            }
//            for (int i = 0; i < k - 1; i++) {
//                priorityQueue.poll();
//            }
//            return priorityQueue.poll();
            return 0;
        }
    }
}
