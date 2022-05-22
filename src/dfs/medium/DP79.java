package dfs.medium;

import java.util.Arrays;

/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP79 {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},
                          {'S', 'F', 'C', 'S'},
                          {'A', 'D', 'E', 'E'}};
        String word = "ABCCEC";
        System.out.println(Solution.exist(board, word));
    }

    static class Solution {

        private static int M;
        private static int N;
        private static int memo[][];

        public static boolean exist(char[][] board, String word) {
            M = board.length;
            N = board[0].length;
            memo = new int[M][N];
            for (int i = 0; i < M; i++) {
                Arrays.fill(memo[i], -1);
            }
            for (int r = 0; r < M; r++) {
                for (int d = 0; d < N; d++) {
                    if (board[r][d] == word.charAt(0)) {
                        boolean matched = dfs(board, r , d , 0, word, memo);
                        if (matched) {
                            return true;
                        }
                    }
                }
            }
            //walk up and down
            return false;
        }

        private static boolean dfs(char[][] board, int r, int d, int index, String word, int memo[][]) {
            if (!(r >= 0 && r <= M - 1) || !(d >= 0 && d <= N - 1)) {
                return false;
            }
            if (index > word.length() - 1) {
                return false;
            }
            if (word.substring(index, index + 1).toCharArray()[0] != board[r][d]) {
                return false;
            }
            if (memo[r][d] == 1)
                return false;
            memo[r][d] = 1;
            index += 1;
            boolean right = dfs(board, r, d + 1, index, word, memo);
            boolean left = dfs(board, r, d - 1, index, word, memo);
            boolean down = dfs(board, r + 1, d, index, word, memo);
            boolean up = dfs(board, r - 1, d, index, word, memo);
            if(index == word.length()){
                return true;
            }
            if ((left || right || down
                    || up)) return true;
            memo[r][d] = 0;
            return false;
        }
    }
}
