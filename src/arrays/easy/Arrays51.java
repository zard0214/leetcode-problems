package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * DFS maybe
 * @author zard
 * @date Created in 21/04/2022 03:21
 */
public class Arrays51 {

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> lists = Solution.solveNQueens(n);
        for (int i = 0; i < lists.size(); i++) {
            List<String> strings = lists.get(i);
            for (int j = 0; j < strings.size(); j++) {
                System.out.printf(strings.get(j) + " ");
            }
            System.out.println();
        }
    }

    static class Solution {
        public static List<List<String>> solveNQueens(int n) {
            List<List<String>> result = new ArrayList<>();
            //init
            for (int i = 0; i < n; i++) {
                List<String> line = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    line.add(".");
                }
                result.add(line);
            }
            return doNQueens(result, n);
        }

        private static List<List<String>> doNQueens(List<List<String>> map, int n) {
            int count = n;
            while (count > 0){

                count--;
            }
            return map;
        }
    }
}
