package arrays.easy;

/**
 * @author zard
 * @date Created in 19/04/2022 16:28
 */
public class Arrays832 {

    /**
     *  [1,1,0]  0,0 ->  0,lenght -1
     *  [1,0,1]
     *  [0,0,0]
     *  ~~~~~~~~
     *  [0,1,1]
     *  [1,0,1]
     *  [0,0,0]
     *  ~~~~~~~
     *  [1,0,0]
     *  [0,1,0]
     *  [1,1,1]
     *
     * @param args
     */
    public static void main(String[] args) {
        int image[][] = {{1,1,0,0}, {1,0,0,1},{0,1,1,1}, {1,0,1,0}};
        int[][] ints = Solution.flipAndInvertImage(image);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class Solution {
        public static int[][] flipAndInvertImage(int[][] image) {
            int[][] result = new int[image.length][image.length];
            for (int i = 0; i < image.length ; i++) {
                for (int j = 0; j < image.length ; j++) {
                    if(0 == image[i][j]){
                        result[i][image.length - j - 1] = 1;
                    }else if(1 == image[i][j]){
                        result[i][image.length - j - 1] = 0;
                    }
                }
            }
            return result;
        }
    }
}
