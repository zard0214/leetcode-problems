package arrays.easy;


/**
 * @author zard
 * @date Created in 19/04/2022 16:22
 */
public class Arrays1464 {
    public static void main(String[] args) {
        int nums[] = {3,7};
        int res = Arrays1464.Solution.maxProduct(nums);
        System.out.println(res);
    }

    static class Solution {
        public static int maxProduct(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if(i != j){
                        int value = (nums[i] - 1) * (nums[j] - 1);
                        if(value >= max) max = value;
                    }
                }
            }
            return max;
        }
    }
}
