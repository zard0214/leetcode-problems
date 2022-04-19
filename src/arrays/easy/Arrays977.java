package arrays.easy;

/**
 * @author zard
 * @date Created in 19/04/2022 15:02
 */
public class Arrays977 {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ints = Solution.sortedSquares(nums);
        for (Integer item: ints
             ) {
            System.out.println(item);
        }
    }

    static class Solution {
        public static int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            int n = nums.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
            return nums;
        }
    }
}
