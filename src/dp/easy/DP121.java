package dp.easy;

import java.util.PriorityQueue;

/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(Solution.maxProfit(prices));
    }

    static class Solution {
        public static int maxProfit(int[] prices) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int max = 0;
            int profit[] = new int[prices.length];
            profit[0] = 0;
            profit[1] = prices[1] - prices[0] > 0 ? prices[1] - prices[0] : profit[0];
            queue.offer(profit[0]);
            queue.offer(profit[1]);
            for (int i = 2; i < prices.length; i++) {
                profit[i] = profit[i - 1] + (prices[i] - prices[i - 1]);
                queue.offer(profit[i]);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(queue.poll());
            }
            return 0 ;
        }
    }
}
