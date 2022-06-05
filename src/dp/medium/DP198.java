
package dp.medium;

/**
  @author zard
  @date Created in 30/09/2021 17:01
 */
public class DP198 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
        int[] nums = {2,7,9,3,1};
        System.out.println(Solution.rob(nums));
//        Solution.coinChange2(coins, 12);
    }

    static class Solution {

        public static int rob(int[] nums) {
            int result[] = new int[nums.length + 1];
            result[0] = 0;
            result[1] = nums[0];
            for (int i = 2; i <= nums.length; i++) {
                System.out.println("result[i - 2] + nums[i - 1] :" +(result[i - 2] + nums[i - 1]));
                System.out.println("result[i - 1] :" + (result[i - 1]));
                result[i] = Math.max(result[i - 1], result[i - 2] + nums[i - 1]);
            }
            return result[nums.length];
        }
    }
}
