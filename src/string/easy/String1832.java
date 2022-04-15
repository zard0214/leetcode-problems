package string.easy;

/**
 * @author zard
 * @date Created in 15/04/2022 07:24
 */
public class String1832 {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean b = Solution.checkIfPangram(sentence);
        System.out.println(b);
    }

    static class Solution {
        public static boolean checkIfPangram(String sentence) {
            String[] pangram = {"a", "b", "c", "d", "e", "f", "g",
                    "h", "i", "j", "k", "l", "m", "n",
                    "o", "p", "q", "r", "s", "t", "u",
                    "v", "w", "x", "y", "z"};
            for (int i = 0; i < pangram.length; i++) {
                if(!sentence.contains(pangram[i]))
                    return false;
            }
            return true;
        }
    }
}
