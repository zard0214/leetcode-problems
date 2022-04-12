package string.easy;

/**
 * @author zard
 * @date Created in 27/09/2021 03:21
 */
public class String1662 {

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(String1662.Solution.arrayStringsAreEqual(word1, word2));
    }

    static class Solution {
        public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            return String.join("", word1).equals(String.join("",word2));
        }
    }

}
