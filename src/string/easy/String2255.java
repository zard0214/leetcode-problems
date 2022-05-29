package string.easy;


/**
 * @author zard
 * @date Created in 18/04/2022 13:17
 */
public class String2255 {
    public static void main(String[] args) {
        String[] words = {"a","a"};
        String s = "aa";
        int a = Solution.countPrefixes(words, s);
        System.out.println(a);
    }

    static class Solution {
        public static int countPrefixes(String[] words, String s) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if(s.startsWith(words[i]))
                    count++;
            }
            return count;
        }
    }
}
