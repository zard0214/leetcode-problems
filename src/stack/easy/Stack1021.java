package stack.easy;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author zard
 * @date Created in 22/04/2022 09:28
 */
public class Stack1021 {

    public static void main(String[] args) {
        String s = "(()())(())";
        String SS = Stack1021.Solution.removeOuterParentheses(s);
        System.out.println(SS);

//        PriorityQueue
    }

    static class Solution {
        public static String removeOuterParentheses(String s) {
            String result = "";
            Stack<Character> stack = new Stack<>();
            return result;
        }
    }
}
