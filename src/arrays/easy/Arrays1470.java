package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 07:43
 */
public class Arrays1470 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,4,3,2,1};
        int n = 4;
        int[] res = Arrays1470.Solution.shuffle(nums, n);
        for (int i : res
        ) {
            System.out.println(i);
        }

    }

    static class Solution {
        public static int[] shuffle(int[] nums, int n) {
            int[] res = new int[2 * n];
            int[][] num = new int[2][n];
            for (int i = 0; i < 2 * n ; i ++) {
                if(i < n){
                    num[0][i] = nums[i];
                }else{
                    num[1][i - n] = nums[i];
                }
            }
            int pos = 0;
            for(int i = 0 ; i < n ; i ++){
                res[pos] = num[0][i];
                pos++;
                res[pos] = num[1][i];
                pos++;
            }
            return res;
        }
    }
}
