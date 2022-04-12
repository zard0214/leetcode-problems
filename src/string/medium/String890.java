package string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 03/10/2021 14:01
 */
public class String890 {

    public static void main(String[] args) {
        String[] words = {"abbaba","bbfbfb","mee","abb","dkd","ccc"};
        String pattern = "abb";
        List<String> andReplacePattern = Solution.findAndReplacePattern(words, pattern);
        for (String item: andReplacePattern
             ) {
            System.out.println("pat: " +item);
        }
    }

    static class Solution {
        public static List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> res = new ArrayList<>();
            return res;
        }
    }
}
