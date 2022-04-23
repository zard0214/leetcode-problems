package string.easy;

/**
 * @author zard
 * @date Created in 21/04/2022 10:41
 */
public class String459 {

    public static void main(String[] args) {
        String s = "abab";

        boolean i = String459.Solution.repeatedSubstringPattern(s);
        System.out.println(i);
    }

    static class Solution {
        public static boolean repeatedSubstringPattern(String s) {
            int i = 0;
            for (int j = 1; j < s.length(); j++) {
                String pattern = s.substring(i, j);
                String[] split = s.split(pattern);
                if(split.length == 0)
                    return true;
                else
                    continue;
            }
            return false;
        }
    }
}
