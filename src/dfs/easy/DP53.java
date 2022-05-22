package dfs.easy;

import java.util.Arrays;

/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Solution.maxSubArray(nums));
    }

    static class Solution {
        private static int M;
        private static int memo[];
        public static int maxSubArray(int[] nums) {
            int max = nums[0];
            M = nums.length;
            for (int i = 1; i < M; i++) {
                int m = nums[i] + max;
                if(max <= m){
                    max += nums[i];
                }else{
                    max = 0;
                }
            }
            return max;
//            memo = new int[M];
//            for(int i = 0 ; i < M ; i ++){
//                Arrays.fill(memo, Integer.MIN_VALUE);
//            }
//            return dfs2(nums, 0, Integer.MIN_VALUE);
        }

//        private static int dfs2(int[] nums, int r, int result){
//            if(r < 0 || r >= M){ return Integer.MAX_VALUE; }
//            if(memo[r] > -1) return memo[r];
//            if(r == M - 1)  return nums[r];
//            result = nums[r];
//            int down = dfs2(nums, r + 1, result);
//            int ans = down > result ? down + nums[r] : nums[r];
//            memo[r] = ans;
//            return ans;
//        }

//        private static int M;
//        private static int N;
//        private static int memo[][];
//
//        public static int minPathSum(int[][] grid) {
//            M = grid.length;
//            N = grid[0].length;
//            memo = new int[M][N];
//            for(int i = 0 ; i < M ; i ++){
//                Arrays.fill(memo[i], -1);
//            }
//            return dfs(grid, 0 , 0);
//        }
//
//        private static int dfs(int[][] grid, int r, int d){
//            if(r < 0 || r >= M || d < 0 || d >= N){ return Integer.MAX_VALUE; }
//            if(memo[r][d] > -1) return memo[r][d];
//            if(r == M - 1 && d == N - 1)  return grid[r][d];
//            int right = dfs(grid, r, d + 1);
//            int down = dfs(grid, r + 1, d);
//            int ans = Math.min(right, down) + grid[r][d];
//            memo[r][d] = ans;
//            return ans;
//        }
    }
}
