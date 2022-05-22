
package dp.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP51 {
    public static void main(String[] args) {
        int k = 4;

//        Solution.printSolution(result);
        System.out.println(Solution.totalNQueens(k));
    }

    static class Solution {
        public static int solveNQueens(int n) {
            List<List<String>> board = initBoard(n);
            List<List<String>> result = new ArrayList<>();
            solveNQUtil(result, board, 0, n);
            return result.size();
        }

        public static int totalNQueens(int n) {
            List<List<String>> board = initBoard(n);
            List<List<String>> result = new ArrayList<>();
            solveNQUtil(result, board, 0, n);
            return result.size();
        }

        private static List<List<String>> initBoard(int N) {
            List<List<String>> board = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                List<String> line = new ArrayList<>();
                for (int j = 0; j < N; j++) {
                    line.add(".");
                }
                board.add(line);
            }
            return board;
        }

        private static void solveNQUtil(List<List<String>> result, List<List<String>> board, int col, int N) {
            int i = 0;
            if (col > N)
                return ;
            if(N == 1){
                List<String> s = new ArrayList<>();
                s.add("Q");
                result.add(s);
                return;
            }
            for (; i < N; i++) {
                if(isSafe(board, i, col, N)) {
                    board.get(i).set(col, "Q");
                    solveNQUtil2(result, board, col + 1, N);
                    board.get(i).set(col, ".");
                }
            }
        }

        private static void solveNQUtil2(List<List<String>> result, List<List<String>> board, int col, int N) {
            for (int i = 0; i < N; i++) {
                if(isSafe(board, i, col, N)) {
                    board.get(i).set(col, "Q");
                    System.out.println("solveNQUtil2 ~~~~~~~~~");
                    printSolution(board);
                    if(hasNqueen(board, N)){
                        add2Result(result, board);
                    }
                    solveNQUtil2(result, board, col + 1, N);
                    board.get(i).set(col, ".");
                }
            }
        }

        private static void add2Result(List<List<String>> result, List<List<String>> board) {
            List<String> re = new ArrayList<>();
            for (int i = 0; i < board.size(); i++) {
                List<String> q = board.get(i);
                String r = "";
                for (int j = 0; j < q.size(); j++) {
                    r += q.get(j);
                }
                re.add(r);
//                System.out.println("r: " + r);
            }
            result.add(re);
        }

        private static boolean hasNqueen(List<List<String>> board, int N) {
            int count = 0;
            for (int i = 0; i < board.size(); i++) {
                List<String> q = board.get(i);
                for (int j = 0; j < q.size(); j++) {
                    if(q.get(j) == "Q")
                        count++;
                }
            }
            if(count == N)
                return true;
            return false;
        }

        private static boolean isSafe(List<List<String>> board, int row, int col, int N) {
            int i, j;
            for (i = 0; i < col + 1; i++)
                if (board.get(row).get(i) == "Q")
                    return false;
            for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
                if (board.get(i).get(j) == "Q")
                    return false;
            for (i = row, j = col; j >= 0 && i < N; i++, j--)
                if (board.get(i).get(j) == "Q")
                    return false;
            return true;
        }

        private static void printSolution(List<List<String>> board) {
            for (int i = 0; i < board.size(); i++) {
                List<String> q = board.get(i);
                for (int j = 0; j < q.size(); j++) {
                    System.out.print(q.get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
