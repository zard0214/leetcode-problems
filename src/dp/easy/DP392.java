package dp.easy;

/**
 * @author zard
 * @date Created in 27/09/2021 03:27
 */
public class DP392 {

    public static void main(String[] args) {
        String s ="", t = "";
        System.out.println(Solution.isSubsequence(s, t));
    }

    static class Solution {
        public static boolean isSubsequence(String s, String t) {
            int len = s.length();
            int tLen = t.length();
            int count = 0;
            if(len == 0){
                return true;
            }
            for (int i = 0; i < tLen; i++) {
                if(count >= len){
                    return true;
                }
                if(s.toCharArray()[count] == t.toCharArray()[i]){
                    count ++;
                }
            }
            return count == len;
        }
    }
}
