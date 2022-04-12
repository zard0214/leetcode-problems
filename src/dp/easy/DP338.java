package dp.easy;


/**
 * @author zard
 * @date Created in 30/09/2021 13:01
 */
public class DP338 {
    public static void main(String[] args) {
        int[] ints = Solution.countBits(10);
    }

//    Input: n = 2
//    Output: [0,1,1]
//    Explanation:
//            0 --> 0
//            1 --> 1
//            2 --> 10
    // 0 :0 0 0 0 0 0 0 0 0 0/
    // 1 :0 0 0 0 0 0 0 0 0 1/
    // 2 :0 0 0 0 0 0 0 0 1 0/

//    Input: n = 5
//    Output: [0,1,1,2,1,2]
//    Explanation:
//            0 --> 0
//            1 --> 1
//            2 --> 10
//            3 --> 11
//            4 --> 100
//            5 --> 101
    // 0 :0 0 0 0 0 0 0 0 0 0/
    // 1 :0 0 0 0 0 0 0 0 0 1/
    // 2 :0 0 0 0 0 0 0 0 1 0/
    // 3 :0 0 0 0 0 0 0 0 1 1/
    // 4 :0 0 0 0 0 0 0 1 0 0/
    // 5 :0 0 0 0 0 0 0 1 0 1/
    static class Solution {

        public static int[] countBits(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println(Integer.toBinaryString(i));

            }

            return null;
        }


    }
}
