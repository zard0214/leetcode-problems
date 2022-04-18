package string.easy;

import string.medium.String921;

/**
 * @author zard
 * @date Created in 18/04/2022 20:51
 */
public class String2129 {
    public static void main(String[] args) {
        String title = "i lOve leetcode";
        String s = Solution.capitalizeTitle(title);
        System.out.println(s);
    }

    static class Solution {
        public static String capitalizeTitle(String title) {
            title = title.toLowerCase();
            String[] words = title.split(" ");
            String result = "";
            for (int i = 0; i < words.length; i++) {
                char[] chars = words[i].toCharArray();
                String s;
                if(chars.length > 2){
                    s = (chars[0] + "").toUpperCase();
                }else{
                    s = (chars[0] + "").toLowerCase();
                }
                char[] chars1 = s.toCharArray();
                chars[0] = chars1[0];
                String s1 = new String(chars);
                if(i != words.length - 1)
                    result += (s1 + " ");
                else{
                    result += (s1);
                }
            }
            return result;
        }
    }
}
