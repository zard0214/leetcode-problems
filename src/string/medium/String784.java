package string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 17/10/2021 13:27
 */
public class String784 {

    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println('A' - 'a');
        List<String> strings = Solution.letterCasePermutation(s);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    static class  Solution {
        public static List<String> letterCasePermutation(String s) {
            List<String> result = new ArrayList<>();
            result.add(s);
            for (int i = 0; i < s.length(); i++) {
                String item;
                if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a'){
                    item = s.substring(0, i) + ' ' +
                            ((s.charAt(i) + "").toUpperCase())  + ' ' +
                            s.substring(i + 1);
                    result.add(item);
                }
            }
            return result;
        }
    }
}
