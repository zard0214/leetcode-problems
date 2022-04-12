package string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 04/10/2021 15:30
 */
public class String1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> strings = Solution.commonChars(words);
        for (String items: strings
             ) {
            System.out.println(items);
        }
    }

    static class Solution {
        public static List<String> commonChars(String[] words) {
            List<String> result = new ArrayList<>();
            String word = words[0];
            for (int i = 1; i < words.length; i++) {

            }
            return result;
        }
    }
}
