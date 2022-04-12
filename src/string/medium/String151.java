package string.medium;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author zard
 * @date Created in 06/10/2021 16:20
 */
public class String151 {
    public static void main(String[] args) {
        String s = "  Bob    Loves  Alice   ";
        String s1 = String151.Solution.reverseWords(s );
        System.out.println(s1);
    }


    public static class Solution {
        public static String reverseWords(String s) {
            s += " ";
            String result = "";
            int L = s.length();
            int i = 0;
            Stack<String> stack = new Stack();
            LinkedList queue = new LinkedList();
            while (i < L){
                if (s.charAt(i) != ' ') {
                    queue.add(s.charAt(i));
                }else{
                    while (!queue.isEmpty()){
                        result += queue.pop();
                    }
                    if(!result.isEmpty()){
                        stack.add(result);
                        stack.add(" ");
                    }
                    result = "";
                }
                i ++;
            }
            while (!stack.empty()){
                result += stack.pop();
            }
            String substring = result.substring(1);
            return substring;
        }
    }
}
