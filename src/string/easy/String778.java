package string.easy;

/**
 * @author zard
 * @date Created in 04/10/2021 05:46
 */
public class String778 {

    public static void main(String[] args) {
        String jewels = "z", stones = "ZZ";
        System.out.println(String778.Solution.numJewelsInStones(jewels, stones));
    }

    static class Solution {
        public static int numJewelsInStones(String jewels, String stones) {
            int res = 0;
            for (int i = 0; i < stones.length(); i++) {
                for (int j = 0; j < jewels.length(); j++) {
                    if(stones.charAt(i) == jewels.charAt(j)){
                        res ++;
                    }
                }
            }
            return res;
        }
    }
}
