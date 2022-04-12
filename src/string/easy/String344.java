package string.easy;

import java.util.Stack;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String344 {

    public static void main(String[] args) {
        char[] s = {'H'};
        Solution.reverseString(s);
        for (Character i : s
             ) {
            System.out.print(i);
        }
    }

    static class Solution {
        public static void reverseString(char[] s) {
            int len = s.length;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < len; i++) {
                stack.push(s[i]);
            }
            for (int i = 0; i < len; i++) {
                s[i] = stack.pop();
            }
        }
    }
}
