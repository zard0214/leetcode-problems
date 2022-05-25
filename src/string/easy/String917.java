package string.easy;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String917 {

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        s = "ab-cd";
        s = "Test1ng-Leet=code-Q!";
        String s1 = Solution.reverseOnlyLetters(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String reverseOnlyLetters(String s) {
            char[] chars = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] >= 'a' && chars[i] <= 'z'
                    ||chars[i] >= 'A' && chars[i] <= 'Z'){
                    stack.push(chars[i]);
                    q.add(i);
                }
            }
            while (!q.isEmpty()){
                Integer poll = q.poll();
                chars[poll] = stack.pop();
            }
            return String.valueOf(chars);
        }
    }
}
