package arrays.easy;

/**
 * @author zard
 * @date Created in 19/04/2022 16:10
 */
public class Arrays1572 {

    public static void main(String[] args) {
        int[][] grid = {{1}};
        int b = Arrays1572.Solution.diagonalSum(grid);
        System.out.println(b);
    }

    static class Solution {
        public static int diagonalSum(int[][] mat) {
            int sum = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if(i == j || mat.length - 1 == i + j){
                        sum += mat[i][j];
                    }

                }
            }
            return sum;
        }
    }
}
