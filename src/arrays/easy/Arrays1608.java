package arrays.easy;

/**
 * @author zard
 * @date Created in 20/04/2022 08:19
 */
public class Arrays1608 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,4,3,0,4};
        int ints = Arrays1608.Solution.specialArray(nums);
        System.out.print(ints);
    }

    static class Solution {
        public static int specialArray(int[] nums) {
            for (int i = 0; i < 1001; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if(nums[j] >= i)
                        count++;
                }
                if(count == i)
                    return i;
            }
            return -1;
        }
    }
}
