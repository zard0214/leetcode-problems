package arrays.medium;

import java.util.Arrays;

/**
 * @author zard
 * @date Created in 20/04/2022 10:35
 */
public class Array347 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,5,1,2,2,3};
        int k = 2;
        int[] ints = Solution.topKFrequent(nums, k);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    static class Solution {
        public static int[] topKFrequent(int[] nums, int k) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {

            }
            return nums;
        }
    }
}
