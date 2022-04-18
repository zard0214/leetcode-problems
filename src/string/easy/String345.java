package string.easy;

import java.util.HashSet;

/**
 * @author zard
 * @date Created in 17/04/2022 09:27
 */
public class String345 {
    public static void main(String[] args) {
        String s = "aA";
        String strings = String345.Solution.reverseVowels(s);
        System.out.println(strings);
    }

    static class Solution {
        public static String reverseVowels(String s) {
            StringBuilder m = new StringBuilder(s);
            HashSet<Character> hs = new HashSet<>();
            hs.add('a');
            hs.add('e');
            hs.add('i');
            hs.add('u');
            hs.add('o');
            hs.add('A');
            hs.add('E');
            hs.add('O');
            hs.add('U');
            hs.add('I');
            int i = 0;
            int j =m.length()-1;
            while (i <= j){
                if(hs.contains(m.charAt(i)) == false){
                    i++;
                }
                else if(hs.contains(m.charAt(j)) == false){
                    j--;
                }
                else {
                    char b = m.charAt(i);
                    m.setCharAt(i, m.charAt(j));
                    m.setCharAt(j,b);
                    i++;
                    j--;

                }
            }
            return m.toString();
        }
    }
}
