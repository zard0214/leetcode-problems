package string.easy;

import java.util.Stack;

/**
 * @author zard
 * @date Created in 04/10/2021 16:05
 */
public class String557 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = Solution.reverseWords(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String reverseWords(String s) {
            String result = "";
            int L = s.length();
            int i = 0;
            Stack stack = new Stack();
            while (i < L){
                if (s.charAt(i) != ' ') {
                    stack.push(s.charAt(i));
                }else{
                    while (!stack.empty()){
                        result += stack.pop();
                    }
                    result += " ";
                }
                i ++;
            }
            while (!stack.empty()){
                result += stack.pop();
            }
            return result;
        }
    }
}
