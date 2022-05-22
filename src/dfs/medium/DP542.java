//package dfs.medium;
//
//
//import java.util.Arrays;
//
///**
// * @author zard
// * @date Created in 30/09/2021 17:01
// */
//public class DP542 {
//    public static void main(String[] args) {
//        int[][] mat = {{0,0,0}, {0,1,0} ,
//                {1,1,1}};
//        int[][] ints = Solution.updateMatrix(mat);
//        for(int i = 0; i < Solution.M; i++){
//            for(int j = 0; j < Solution.N; j++){
//                System.out.print(ints[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static class Solution {
//        private static int M;
//        private static int N;
//        private static int memo[][], result[][];
//        private static int c;
//
//        public static int[][] updateMatrix(int[][] mat) {
//            M = mat.length;
//            N = mat[0].length;
//            memo = new int[M][N];
//            result = new int[M][N];
//            for(int i = 0 ; i < M ; i ++){
//                Arrays.fill(memo[i], -1);
//            }
//            for (int i = 0; i < M; i++) {
//                for (int j = 0; j < N; j++) {
//                    result[i][j] = dfs(mat, i, j, memo);
//                }
//            }
//            return result;
//        }
//
//        private static int dfs(int[][] mat, int r, int d, int[][] memo) {
//            if(!(r >= 0 && r <= M - 1) || !(d >= 0 && d <= N - 1))
//                return 0;
//            int right = dfs(mat, r, d + 1, memo);
//            int left = dfs(mat, r, d - 1, memo);
//            int down = dfs(mat, r + 1, d, memo);
//            int up = dfs(mat, r - 1, d, memo);
//        }
//    }
//
////        public static int dfs(int[][] mat, int r, int d, int count, int memo[][]){
////            if(!(r >= 0 && r <= M - 1) || !(d >= 0 && d <= N - 1))
////                return 0;
////            if(mat[r][d] == 0){
////                return count;
////            }
////            if(mat[r][d] == 1){
////                return 1;
////            }
////            if(memo[r][d] == 1)
////                return 0;
////            memo[r][d] = 0;
////            int right = dfs(mat, r , d  + 1, count, memo);
////            int left = dfs(mat, r, d - 1, count, memo);
////            int down = dfs(mat, r + 1, d, count, memo);
////            int up = dfs(mat, r - 1, d, count, memo);
////            if(right == 1 || left == 1 || down == 1 || up == 1)
////                count++;
////            memo[r][d] = 1;
////            return count;
////        }
////    }
//}
