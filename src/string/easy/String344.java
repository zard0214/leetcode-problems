package string.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String344 {

    public static void main(String[] args) {
        String s = "1326#";
        String s1 = Solution.freqAlphabets(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String freqAlphabets(String s) {
            char[] chars = s.toCharArray();
            Map<String, Character> map = new HashMap<>();
            map.put("1", 'a');
            map.put("2", 'b');
            map.put("3", 'c');
            map.put("4", 'd');
            map.put("5", 'e');
            map.put("6", 'f');
            map.put("7", 'g');
            map.put("8", 'h');
            map.put("9", 'i');
            map.put("10#", 'j');
            map.put("11#", 'k');
            map.put("12#", 'l');
            map.put("13#", 'm');
            map.put("14#", 'n');
            map.put("15#", 'o');
            map.put("16#", 'p');
            map.put("17#", 'q');
            map.put("18#", 'r');
            map.put("19#", 's');
            map.put("20#", 't');
            map.put("21#", 'u');
            map.put("22#", 'v');
            map.put("23#", 'w');
            map.put("24#", 'x');
            map.put("25#", 'y');
            map.put("26#", 'z');
            String result = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                if(chars[i] == '#'){
                    String substring = s.substring(i - 2, i + 1);
                    System.out.println(substring);
                    String s1 = map.get(substring).toString();
                    result += s1;
                    i -= 2;
                }else{
                    String substring = s.substring(i, i + 1);
                    String s1 = map.get(substring).toString();
                    result += s1;
                }
            }
            return new StringBuffer(result).reverse().toString();
        }
    }
}
