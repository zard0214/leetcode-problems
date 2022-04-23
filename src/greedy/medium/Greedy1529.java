package greedy.medium;


/**
 *
 * You are given a 0-indexed binary string target of length n. You have another binary string s of length n that is initially set to all zeros. You want to make s equal to target.
 *
 * In one operation, you can pick an index i where 0 <= i < n and flip all bits in the inclusive range [i, n - 1]. Flip means changing '0' to '1' and '1' to '0'.
 *
 * Return the minimum number of operations needed to make s equal to target.
 *
 * @author zard
 * @date Created in 23/04/2022 01:30
 */
public class Greedy1529 {
    public static void main(String[] args) {
        String target = "001011101";
        int result = Solution.minFlips(target);
        System.out.println(result);
    }

    static class Solution {
        public static int minFlips(String target) {
            int result = 0;
            char c = '0';
            for(char ch : target.toCharArray()){
                if(ch != c){
                    result ++;
                    c = ch;
                }
            }
            return result;
        }
    }
}
