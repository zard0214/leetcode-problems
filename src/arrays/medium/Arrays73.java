package arrays.medium;

/**
 * @author zard
 * @date Created in 21/04/2022 08:13
 */
public class Arrays73 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,1,1}, {1,0,1}, {1,1,1}};
        Arrays73.Solution.setZeroes(matrix);
    }

    static class Solution {
        public static void setZeroes(int[][] matrix) {
            boolean[][] result = new boolean[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        for (int k = 0; k < matrix[0].length; k++) {
                            result[i][k] = true;
                        }
                        for (int k = 0; k < matrix.length; k++) {
                            result[k][j] = true;
                        }
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(result[i][j]){
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
