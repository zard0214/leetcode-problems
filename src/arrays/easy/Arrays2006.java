package arrays.easy;

/**
 * @author zard
 * @date Created in 25/09/2021 04:47
 */
public class Arrays2006 {

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;
        int i = Solution.countKDifference(nums, k);
        System.out.println(i);
    }

    static class Solution {
        public static int countKDifference(int[] nums, int k) {
            int count = 0;
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if(nums[i] - nums[j] == k
                            ||nums[j] - nums[i] == k )
                        count ++;
                }
            }
            return count;
        }
    }
}
