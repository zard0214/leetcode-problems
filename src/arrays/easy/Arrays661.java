package arrays.easy;


/**
 * @author zard
 * @date Created in 21/04/2022 10:14
 */
public class Arrays661 {

    public static void main(String[] args) {
        int[][] img = new int[][]{{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] ints = Arrays661.Solution.imageSmoother(img);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class Solution {
        public static int[][] imageSmoother(int[][] img) {

            return img;
        }
    }
}
