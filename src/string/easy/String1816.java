package string.easy;

/**
 * @author zard
 * @date Created in 26/09/2021 20:09
 */
public class String1816 {
    public static void main(String[] args) {
       String s =  "chopper is not a tanuki";
       int k = 5;
       String s1 = Solution.truncateSentence(s, k);
       System.out.println(s1);
    }

    static class Solution {
        public static String truncateSentence(String s, int k) {
            char[] chars = s.toCharArray();
            String res = "";
            int count = 0;
            for (int i = 1; i < s.length(); i++) {
                if(chars[i] != ' '){
                    res += chars[i];
                }else{
                    if(chars[i - 1] != ' '){
                        res += ' ';
                        count ++;
                    }
                }
                if(count > k - 1) {
                    break;
                }
            }
            if(res.endsWith(" ")){
                return res.substring(0, res.length() - 1);
            }
            return res;
        }
    }
}
