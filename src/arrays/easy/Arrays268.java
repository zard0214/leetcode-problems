package arrays.easy;

import arrays.medium.Arrays48;

import java.util.Arrays;

/**
 * @author zard
 * @date Created in 21/04/2022 08:41
 */
public class Arrays268 {

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int i = Solution.missingNumber(nums);
        System.out.println(i);
    }

    static class Solution {
        public static int missingNumber(int[] nums) {
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++) {
                if(i != nums[i]) {
                    return i;
                }
            }
            return nums.length;
        }
    }
}
