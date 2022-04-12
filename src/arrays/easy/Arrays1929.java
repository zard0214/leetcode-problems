package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 05:43
 */
public class Arrays1929 {

    public static void main(String[] args) {
        int[] nums  = new int[]{1};
        int[] ints = Arrays1929.Solution.getConcatenation(nums);
        for(int i = 0 ; i < ints.length ; i ++){
            System.out.println(ints[i]);
        }

    }

    static class Solution {
        public static int[] getConcatenation(int[] nums) {
            int[] nums2 = new int[nums.length*2];
            for(int i = 0; i < nums.length; i++)
            {
                nums2[i] = nums[i];
                nums2[nums.length+i] = nums[i];
            }
            return nums2;
        }
    }
}
