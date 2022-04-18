package string.easy;

import string.medium.String1079;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zard
 * @date Created in 18/04/2022 12:54
 */
public class String804 {
    public static void main(String[] args) {
        String[] words = {"a"};
        int i = String804.Solution.uniqueMorseRepresentations(words);
        System.out.println(i);
    }

    static class Solution {
        public static int uniqueMorseRepresentations(String[] words) {
            Set result = new HashSet();
            String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            for (int i = 0; i < words.length; i++) {
                String re = "";
                char[] word = words[i].toCharArray();
                for (int j = 0; j < word.length; j++) {
                    re += morse[word[j] - 'a'];
                }
                result.add(re);
            }
            return result.size();
        }
    }
}
