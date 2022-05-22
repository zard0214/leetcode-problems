package knapsack;


/**
 * @author zard
 * @date Created in 29/04/2022 18:49
 */
public class Knapsack518 {

    public static void main(String[] args) {
        int[] coins = {1,5,2};
        int amount = 6;
        int i = Knapsack518.Solution.change(amount, coins);

        String s = Solution.completePack(amount, 3, coins, coins);

        int i2 = Solution.completePack2(amount, 3, coins, coins);
        System.out.println(i);
        System.out.println(s);
        System.out.println(i2);
    }

    static class Solution {

        public static String completePack(int V,int N,int[] weight,int[] value){
            //初始化动态规划数组
            int[][] dp = new int[N+1][V+1];
            //为了便于理解,将dp[i][0]和dp[0][j]均置为0，从1开始计算
            for(int i=1;i<N+1;i++){
                for(int j=1;j<V+1;j++){
                    //如果第i件物品的重量大于背包容量j,则不装入背包
                    //由于weight和value数组下标都是从0开始,故注意第i个物品的重量为weight[i-1],价值为value[i-1]
                    if(weight[i-1] > j)
                        dp[i][j] = dp[i-1][j];
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-weight[i-1]]+value[i-1]);
                }
            }
            //则容量为V的背包能够装入物品的最大值为
            int maxValue = dp[N][V];
            int j=V;
            String numStr="";
            for(int i=N;i>0;i--){
                //若果dp[i][j]>dp[i-1][j],这说明第i件物品是放入背包的
                while(dp[i][j]>dp[i-1][j]){
                    numStr = i + " " + numStr;
                    j=j-weight[i-1];
                }
                if(j==0)
                    break;
            }
            return numStr;
        }

        /**
         *
         * @param V
         * @param N
         * @param weight
         * @param value
         * @return
         */
        public static int completePack2(int V,int N,int[] weight,int[] value){
            int[] dp = new int[V+1];
            for(int i=1;i<N+1;i++){
                for(int j=weight[i-1];j<V+1;j++){
                    dp[j] = Math.max(dp[j-weight[i-1]]+value[i-1],dp[j]);
                }
            }
            return dp[V];
        }

        public static int change(int amount, int[] coins) {
            int dp[] = new int[amount + 1];
            int count = 0;
            for(int i = 0; i <= amount; i++){
                for(int j = 0; j < coins.length; j++){
                    if(coins[j] == i){
                        dp[i] = max(dp[i], dp[i - coins[j]] + coins[j], count, amount);
                        if(dp[i] == amount)
                            count++;
                    }
                }
            }
            return count;
        }
        private static int max(int i, int j, int count, int amount)
        {
            return (i > j) ? i : j;
        }
    }
}
