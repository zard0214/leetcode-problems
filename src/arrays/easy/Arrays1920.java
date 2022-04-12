package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 05:30
 */
public class Arrays1920 {

    public static void main(String[] args) {
        int[] nums  = new int[]{0,2,1,5,3,4};
        int[] ints = Solution.buildArray(nums);
        for(int i = 0 ; i < ints.length ; i ++){
            System.out.println(ints[i]);
        }

    }

    static class Solution {
        public static int[] buildArray(int[] nums) {
            int[] ans  = new int[nums.length];
            for(int i = 0 ; i < nums.length ; i ++){
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
    }
}
