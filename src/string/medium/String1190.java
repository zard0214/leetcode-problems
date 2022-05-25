package string.medium;

import com.sun.xml.internal.ws.util.StringUtils;

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
        //Input: s = "(abcd)"
        //Output: "dcba"
        String s = "(u(love)i)";
        //Output: "iloveu"
        //Input: s = "(ed(et(oc))el)"
        //Output: "leetcode"
        String s1 = Solution.reverseParentheses(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String reverseParentheses(String s) {
            Stack<Character> stack=  new Stack<>();
            for(char c:s.toCharArray()){
                if(c == ')'){
                    StringBuilder inter = new StringBuilder();
                    while(stack.peek() != '('){
                        inter.append(stack.pop());
                    }
                    stack.pop();
                    for(int i = 0;i < inter.length(); i++){
                        stack.push(inter.charAt(i));
                    }

                }
                else {
                    stack.push(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }

}
