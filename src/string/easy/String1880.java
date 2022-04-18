package string.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zard
 * @date Created in 18/04/2022 13:02
 */
public class String1880 {
    public static void main(String[] args) {
        String firstWord = "aaa", secondWord = "a", targetWord = "aaaa";
        boolean sumEqual = Solution.isSumEqual(firstWord, secondWord, targetWord);
        System.out.println(sumEqual);
    }

    static class Solution {
        public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            char[] firstWords = firstWord.toCharArray();
            int firstNumerical = 0, secondNumerical = 0, targetNumerical = 0;
            String firstNumericalStr = "";
            for (int i = 0; i < firstWords.length; i++) {
                firstNumericalStr += (firstWords[i] - 'a');
            }
            firstNumerical = Integer.parseInt(firstNumericalStr);
            char[] secondWords = secondWord.toCharArray();
            String secondNumericalStr = "";
            for (int i = 0; i < secondWords.length; i++) {
                secondNumericalStr += (secondWords[i] - 'a');
            }
            secondNumerical = Integer.parseInt(secondNumericalStr);
            char[] targetWords = targetWord.toCharArray();
            String targetNumericalStr = "";
            for (int i = 0; i < targetWords.length; i++) {
                targetNumericalStr += (targetWords[i] - 'a');
            }
            targetNumerical = Integer.parseInt(targetNumericalStr);
            if(targetNumerical == firstNumerical + secondNumerical)
                return true;
            return false;
        }
    }
}
