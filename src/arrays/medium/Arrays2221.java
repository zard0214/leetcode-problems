package arrays.medium;


/**
 * @author zard
 * @date Created in 21/04/2022 10:02
 */
public class Arrays2221 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,-2,3,4,-5};
        int ints = Arrays2221.Solution.triangularSum(nums);
        System.out.print(ints);
    }

    static class Solution {
        public static int triangularSum(int[] nums) {
            return triangularSum1(nums)[0];
        }

        public static int[] triangularSum1(int[] nums) {
            if(nums.length == 1)
                return nums;
            int result[] = new int[nums.length - 1];
            for (int i = 0; i < nums.length - 1; i++) {
                result[i] = (nums[i] + nums[i + 1]) % 10;
            }
            if(result.length == 1)
                return result;
            else
                return triangularSum1(result);
        }
    }
}
