package dp.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP1646 {

    public static void main(String[] args) {
        int n = 0;
        System.out.println(Solution.getMaximumGenerated(n));
    }

    static class Solution {
        public static int getMaximumGenerated(int n) {
//            if(n == 0)
//                return 0;
            int[] nums = new int[n + 1];
            nums[0] = 0;
            nums[1] = 1;
            for (int i = 2; i < n + 1; i++) {
                if(i % 2 == 0){
                    nums[i] = nums[i / 2];
                }else if(i % 2 != 0){
                    nums[i] = nums[i / 2] + nums[i / 2 + 1];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            Arrays.sort(nums);
            System.out.println();
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            return nums[n];
        }
    }
}
