package string.easy;


/**
 * @author zard
 * @date Created in 18/04/2022 11:28
 */
public class String2124 {
    public static void main(String[] args) {
        String s = "bbb";
        boolean b = Solution.checkString(s);
        System.out.println(b);
    }

    static class Solution {
        public static boolean checkString(String s) {
            if(!s.contains("a"))
                return true;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == 'b'){
                    for (int j = i + 1; j < chars.length; j++) {
                        if(chars[j] == 'a')
                            return false;
                    }
                }
            }
            return true;
        }
    }
}
