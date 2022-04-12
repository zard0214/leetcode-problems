package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 07:35
 */
public class Arrays1480 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2,10,1};
        int[] res = Arrays1480.Solution.runningSum(nums);
        for (int i: res
        ) {
            System.out.println(i);
        }

    }

    static class Solution {
        public static int[] runningSum(int[] nums) {
            int[] res = new int[nums.length];
            int temp = 0;
            for (int i = 0 ; i < nums.length ; i ++){
                temp += nums[i];
                res[i] = temp;
            }
            return res;
        }
    }
}
