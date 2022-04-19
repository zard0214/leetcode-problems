package arrays.easy;

/**
 * @author zard
 * @date Created in 19/04/2022 13:35
 */
public class Arrays1351 {

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1}, {1, 1,-1,-2}, {-1,-1,-2,-3}};
        int b = Arrays1351.Solution.countNegatives(grid);
        System.out.println(b);
    }

    static class Solution {
        public static int countNegatives(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] < 0)
                        count++;
                }
            }
            return count;
        }
    }
}
