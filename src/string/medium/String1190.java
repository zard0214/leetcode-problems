package string.medium;

import java.util.Stack;

/**
 * @author zard
 * @date Created in 06/10/2021 15:50
 */
public class String1190 {

//    Input: s = "(abcd)"
//    Output: "dcba"

//    Input: s = "(u(love)i)"
//    Output: "iloveu"
//    Explanation: The substring "love" is reversed first, then the whole string is reversed.

//    Input: s = "(ed(et(oc))el)"
//    Output: "leetcode"
//    Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

    public static void main(String[] args) {
        String s = "(a(bc)d)";
        String s1 = Solution.reverseParentheses(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String reverseParentheses(String s) {
            String result = "";
            Stack<Character> stack = new Stack<>();
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if(i > 0){
                    if(s.charAt(i - 1) == '('){
                        stack = new Stack<>();
                    }
                    if(s.charAt(i) == ')'){
                        System.out.println("i: " + i);
                    }
                }

            }
            return result;
        }
    }

}
