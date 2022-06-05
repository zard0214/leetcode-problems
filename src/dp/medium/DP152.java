package dp.medium;


/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP152 {
    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
//        int[] nums = {4,-1,2,1};
//        int[] nums = {5,4,-1,7,8};
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

//        Input: nums = [1]
//        Output: 1

//        Input: nums = [5,4,-1,7,8]
//        Output: 23
        System.out.println(Solution.maxProduct(nums));
    }

    static class Solution {
        //Kadane’s algorithm

        public static int maxProduct(int[] nums) {
            int curMax = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                curMax = Math.max(curMax * nums[i], nums[i]);
                max = Math.max(curMax, max);
            }
            return max;
        }
    }
}
