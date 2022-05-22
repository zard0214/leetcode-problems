
package dp.medium;

import java.util.Arrays;

/**
  @author zard
  @date Created in 30/09/2021 17:01
 */
public class DP322 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        System.out.println(Solution.coinChange(coins, 5));
//        Solution.coinChange2(coins, 12);
    }

    static class Solution {

        public static int coinChange(int[] coins, int amount) {
            int d[] = new int[amount+1];
            d[0] = 1;
            for(int j = 0;j < coins.length;j++){
                for(int i = 1;i <= amount;i++){
                    if(i - coins[j] >= 0)
                        d[i] += d[i-coins[j]];
                }
            }
            return d[amount];
        }
    }
}
