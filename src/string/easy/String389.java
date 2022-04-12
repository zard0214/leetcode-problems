package string.easy;

import string.pattern;

/**
 * @author zard
 * @date Created in 06/10/2021 19:18
 */
public class String389 {

//    Input: s = "abcd", t = "abcde"
//    Output: "e"
//    Explanation: 'e' is the letter that was added.
//
//    Input: s = "", t = "y"
//    Output: "y"
//
//    Input: s = "a", t = "aa"
//    Output: "a"
//
//    Input: s = "ae", t = "aea"
//    Output: "a"

    public static void main(String[] args) {
        String s = "ae", t = "aea";
        char theDifference = Solution.findTheDifference(s, t);
        System.out.println(theDifference);
    }

    static class Solution {
        public static char findTheDifference(String s, String t) {
            s = s + " ";
            char res = ' ';
            int i = 0;
            int j = 0;
            while (i < s.length()){
                if(s.charAt(i) != t.charAt(j)){
                    return t.charAt(j);
                }else{
                    i ++;
                    j ++;
                }
            }
            return res;
        }
    }
}
