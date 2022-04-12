package string.easy;

import java.util.Stack;

/**
 * @author zard
 * @date Created in 27/09/2021 08:02
 */
public class String2000 {

    public static void main(String[] args) {
        String word = "rzwuktxcjfpamlonbgyieqdvhs";
        char ch = 's';
//        String word = "abcdefg";
//        char ch = 'f';
        String s = Solution.reversePrefix(word, ch);
        System.out.println(s);
    }

    static class Solution {
        public static String reversePrefix(String word, char ch) {
            int len = word.length();
            char[] wordc = word.toCharArray();
            String res = "";
            int index = 0;
            Stack stack = new Stack();
            for (int i = 0; i < len; i++) {
                if(ch == wordc[i]){
                    stack.push(wordc[i]);
                    System.out.println("i :" + i);
                    index = i;
                    break;
                }else{
                    System.out.println("stack.push :" + wordc[i]);
                    stack.push(wordc[i]);
                }
            }
            if(stack.size() == len){
                if(word.endsWith(ch + "")){
                    while (!stack.empty()){
                        res += stack.pop();
                    }
                }else{
                    res = word;
                }
            }else{
                while (!stack.empty()){
                    res += stack.pop();
                }
                res += word.substring(index + 1);
            }
            return res;
        }
    }
}
