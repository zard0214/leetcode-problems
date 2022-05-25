package string.easy;

import java.util.HashMap;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String2278 {

    public static void main(String[] args) {
//        String sentence = "I speak Goat Latin";
        String s = "sgawtb";
        char letter = 's';
        int s1 = Solution.percentageLetter(s, letter);
        System.out.println(s1);
    }

    static class Solution {
        public static int percentageLetter(String s, char letter) {
            HashMap<Character, Integer> countMap = new HashMap<>();
            countMap.put(letter, 0);
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == letter)
                    countMap.put(letter, countMap.get(letter) + 1);
            }
//            long round = Math.round();
            double v = Double.parseDouble(countMap.get(letter) + "")
                    / Double.parseDouble(chars.length + "") * 100;
            double floor = Math.floor(v);
            return Double.valueOf(floor).intValue();
        }
    }
}
