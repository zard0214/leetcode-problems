package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 22:20
 */
public class Arrays1720 {

    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int first = 4;
        int[] decode = Solution.decode(encoded, first);
        for (int item: decode
             ) {
            System.out.println(item);
        }

    }

    static class Solution {
        public static int[] decode(int[] encoded, int first) {
            int[] res = new int[encoded.length + 1];
            res[0] = first;
            for (int i = 1; i < encoded.length + 1; i++) {
                System.out.println("res[i - 1] :" + res[i - 1]);
                System.out.println("encoded[i - 1] :" + encoded[i - 1]);
                res[i] = res[i - 1] ^ encoded[i - 1];
                System.out.println("res[i] :" + res[i]);
            }
            return res;
        }
    }

}
