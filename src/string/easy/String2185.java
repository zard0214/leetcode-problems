package string.easy;

import java.util.Stack;

/**
 * @author zard
 * @date Created in 15/04/2022 06:53
 */
public class String2185 {

    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        String pref = "code";
        int s = String2185.Solution.prefixCount(words, pref);
        System.out.println(s);
    }

    static class Solution {
        public static int prefixCount(String[] words, String pref) {
            int count = 0;
            for (String word: words
                 ) {
                if(word.startsWith(pref)){
                    count ++;
                }
            }
            return count;
        }
    }
}
