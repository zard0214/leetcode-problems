package string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 21/04/2022 10:41
 */
public class String1876 {

    public static void main(String[] args) {
        String s = "xyzzaz";

        int i = Solution.countGoodSubstrings(s);
        System.out.println(i);
    }

    static class Solution {
        public static int countGoodSubstrings(String s) {
            int count = 0;
            List<String> substring = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i+1; j <= s.length(); j++) {
                    substring.add(s.substring(i,j));
                }
            }
            for (int i = 0; i < substring.size(); i++) {
                if(!containRepeatChar(substring.get(i))){
                    count++;
                }
            }
            return count;
        }

        public static boolean containRepeatChar(String str){
            if(str.length() != 3)
                return true;
            if(str==null||str.isEmpty()){
                return false;
            }
            char[] elements=str.toCharArray();
            for(char e:elements){
                if(str.indexOf(e)!=str.lastIndexOf(e)){
                    return true;
                }
            }
            return false;
        }
    }
}
