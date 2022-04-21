package arrays.easy;


/**
 * @author zard
 * @date Created in 20/04/2022 08:05
 */
public class Arrays1991 {
    public static void main(String[] args) {
        int[] nums = new int[]{0};
        int ints = Arrays1991.Solution.findMiddleIndex(nums);
        System.out.print(ints);
    }

    static class Solution {
        public static int findMiddleIndex(int[] nums) {
            int leftSum = 0;
            int rightSum = 0;
            for(int i=1; i<nums.length; i++){
                rightSum += nums[i];
            }
            if(leftSum == rightSum) {
                return 0;
            }
            for(int i=1; i<nums.length; i++) {
                leftSum += nums[i-1];
                rightSum -= nums[i];
                if(leftSum == rightSum) {
                    return i;
                }
            }
            return -1;
        }
    }
}
