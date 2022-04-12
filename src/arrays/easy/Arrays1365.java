package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 21:46
 */
public class Arrays1365 {

    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        int[] ints = Solution.smallerNumbersThanCurrent(nums);
        for (int i: ints
             ) {
            System.out.println(i);
        }
    }

    static class Solution {
        public static int[] smallerNumbersThanCurrent(int[] nums) {
            int[] res = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if(i != j && nums[j] < nums[i]){
                        count++;
                    }
                }
                res[i] = count;
            }
            return res;
        }
    }
}
