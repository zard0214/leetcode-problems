package string.easy;


/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String1844 {

    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        String s1 = Solution.replaceDigits(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String replaceDigits(String s) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(i % 2 != 0){
                    Character c = chars[i - 1];
                    Character d = chars[i];
                    chars[i] = (char)(c + Integer.parseInt(d + ""));
                }
            }
            return String.valueOf(chars);
        }
    }
}
