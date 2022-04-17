package string.easy;

import string.hard.String420;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zard
 * @date Created in 17/04/2022 09:11
 */
public class String1408 {

    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        List<String> strings = Solution.stringMatching(words);
        System.out.println(strings);
    }

    static class Solution {
        public static List<String> stringMatching(String[] words) {
            Set matching = new HashSet();
            List matching2 = new ArrayList();
            if(words.length == 1){
                return matching2;
            }
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if(words[i].contains(words[j])){
                        matching.add(words[j]);
                    }
                    if(words[j].contains(words[i])){
                        matching.add(words[i]);
                    }
                }
            }
            matching2.addAll(matching);
            return matching2;
        }
    }
}
