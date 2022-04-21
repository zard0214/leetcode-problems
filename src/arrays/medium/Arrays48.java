package arrays.medium;

/**
 * @author zard
 * @date Created in 21/04/2022 08:13
 */
public class Arrays48 {

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
//        int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix = new int[][]{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}
                , {16,17,18,19,20}, {21,22,23,24,25}};
        Arrays48.Solution.rotate(matrix);
    }

    static class Solution {
        public static void rotate(int[][] matrix) {
            int[][] result = new int[matrix.length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    int value = matrix[i][j];
                    result[j][i] = value;
                }
            }
            for (int i = 0; i  < matrix.length; i++) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[i][matrix.length - j - 1] = result[i][j];
                }
            }
        }
    }
}
