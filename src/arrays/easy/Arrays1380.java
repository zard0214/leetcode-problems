package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * A lucky number is an element of the matrix such that it is the minimum element in its row
 *  and maximum in its column.
 * @author zard
 * @date Created in 20/04/2022 03:20
 */
public class Arrays1380 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> integers = Solution.luckyNumbers(matrix);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

    }
//            [1,10, 4, 2],
//            [9, 3, 8, 7],
//            [15,16,17,12]
    static class Solution {
        public static List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            int m = matrix.length; //4
            int n = matrix[0].length;//3
            for (int i = 0; i < m; i++) {
                int min = 0;
                for (int j = 0; j < n; j++) {
                    boolean isLuckyNumber = true;
                    int max = Integer.MIN_VALUE;
                    //maximum in its column
                    max = matrix[i][j];
                    for (int k = 0; k < m; k++) {
                        if(matrix[k][j] > max){
                            isLuckyNumber = false;
                            break;
                        }
                    }
                    //minimum element in its row
                    min = matrix[i][j];
                    for (int k = 0; k < n; k++) {
                        if(matrix[i][k] < min){
                            isLuckyNumber = false;
                            break;
                        }
                    }
                    if(isLuckyNumber){
                        result.add(matrix[i][j]);
                    }
                }
            }
            return result;
        }
    }
}
