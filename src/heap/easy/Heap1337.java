package heap.easy;


import java.util.Stack;

/**
 * @author zard
 * @date Created in 21/04/2022 11:02
 */
public class Heap1337 {

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        int k = 3;
        int[] i = Heap1337.Solution.kWeakestRows(mat, k);
        System.out.println(i);
    }

    static class Solution {
        public static int[] kWeakestRows(int[][] mat, int k) {
            int[] result = new int[]{};
            for (int j = 0; j < mat[0].length; j++) {
                Stack<Integer> stack = new Stack<>();
                for (int i = 0; i < mat.length; i++) {
                    stack.push(mat[i][j]);
                }
            }
            return result;
        }
    }
}
