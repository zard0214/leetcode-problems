package string.easy;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String821 {

    public static void main(String[] args) {
        String s;
        s = "aaab";
        char c = 'b';
        int[] s1 = Solution.shortestToChar(s, c);
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i] + " ");
        }
    }

    static class Solution {
        public static int[] shortestToChar(String s, char c) {
            int[] result  = new int[s.length()];
            Arrays.fill(result, -1);
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int k = 0; k < chars.length; k++) {
                    if(c == chars[k]){
                        if(result[i] == -1){
                           result[i] = Math.abs(k - i);
                        }else {
                            if(result[i] > Math.abs(k - i))
                                result[i] = Math.abs(k - i);
                        }
                    }
                }
            }
            return result;
        }
    }
}
