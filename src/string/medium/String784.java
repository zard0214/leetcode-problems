package string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: s = "a1b2"
 * Output: ["a1b2","a1B2","A1b2","A1B2"]
 *
 * Input: s = "3z4"
 * Output: ["3z4","3Z4"]
 *
 * @author zard
 * @date Created in 17/10/2021 13:27
 */
public class String784 {

    public static void main(String[] args) {
        String s = "mQe";
//        System.out.println('A' - 'a');
        List<String> strings = Solution.letterCasePermutation(s);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    static class  Solution {
        public static List<String> letterCasePermutation(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a' ||
                        s.charAt(i) <= 'Z' && s.charAt(i) >= 'A'){
                    count ++;
                }
            }
            List<String> result = new ArrayList<>();
            result.add(s);
            for (int j = 0; j < s.length(); j ++){
                String item = "";
                int t = 0;
                int total = 0;
                if (isa(s, j) ||
                        isA(s, j)) {
                    if (isa(s, j)) {
                        item = s.substring(0, j) +
                                ((s.charAt(j) + "").toUpperCase()) +
                                s.substring(j + 1);
                    } else {
                        item = s.substring(0, j) +
                                ((s.charAt(j) + "").toLowerCase()) +
                                s.substring(j + 1);
                    }
                    result.add(item);
                    t ++;
                    for (int i = j; i < s.length(); i++) {
                        while (total < count - t){
                            for (int k = j + 1; k < s.length(); k++) {
                                if(!item.isEmpty())
                                    if (isa(s, k) ||
                                            isA(s, k)) {
                                        if (isa(s, k)) {
                                            item = item.substring(0, k) +
                                                    ((s.charAt(k) + "").toUpperCase()) +
                                                    s.substring(k + 1);
                                            result.add(item);
                                            total ++;
                                        } else {
                                            System.out.println("item:" + item);
                                            item = item.substring(0, k) +
                                                    ((s.charAt(k) + "").toLowerCase()) +
                                                    s.substring(k + 1);
                                            result.add(item);
                                            total ++;
                                        }
                                        count--;
                                    }
                            }
                        }
                    }

                }
            }
            return result;
        }

        private static boolean isA(String s, int j) {
            return s.charAt(j) <= 'Z' && s.charAt(j) >= 'A';
        }

        private static boolean isa(String s, int j) {
            return s.charAt(j) <= 'z' && s.charAt(j) >= 'a';
        }
    }
}
