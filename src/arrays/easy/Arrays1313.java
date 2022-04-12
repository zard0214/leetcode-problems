package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 23:04
 */
public class Arrays1313 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        int[] decode = Arrays1313.Solution.decompressRLElist(nums);
        for (int item: decode
        ) {
            System.out.println(item);
        }

    }

    static class Solution {
        public static int[] decompressRLElist(int[] nums) {
            int length = 0;
            int[][] num = new int[2][nums.length / 2];
            for (int i = 0 ; i < nums.length ; i ++){
                if(i % 2 == 0){
                    length += nums[i];
                    num[0][i / 2] = nums[i];
                    num[1][i / 2] = nums[i + 1];
                }
            }
            int[] res = new int[length];
            int index = 0;
            for (int i = 0; i < nums.length / 2; i++) {
                for (int j = 0; j < num[0][i]; j++) {
                    res[index] = num[1][i];
                    index ++;
                }
            }
            return res;
        }
    }
}
