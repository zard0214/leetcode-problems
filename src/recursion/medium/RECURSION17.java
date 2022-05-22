package recursion.medium;


import java.util.*;

public class RECURSION17 {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(Solution.letterCombinations(digits));
    }

    static class Solution {
        public static List<String> letterCombinations(String digits) {
            int[] memo = new int[digits.length()];
            Arrays.fill(memo, -1);
            List<String> result = new ArrayList<>();
            return dfs(digits, 0 ,"", result);
        }

        private static List<String> dfs(String digits, int index, String cur,
                                        List<String> result) {
            if(index > digits.length() - 1)
                return result;
            if(index == digits.length() - 1)
                result.add(cur);

            return null;
        }
//        public static List<String> letterCombinations(String digits) {
//            Map<Character, List<Character>> map = new HashMap<>();
//            map = setMap(map);
//            char[] digit = digits.toCharArray();
//            List<String> result = new ArrayList<>();
//            String resultStr = new String();
//            recursion(result, digit,"", 0);
//            return result;
//        }
//
//        private static void recursion(List<String> result, char[] digits,
//                                      String resultStr, int digital) {
////            if(index == digits.length - 1){
////                result.add(resultStr);
////            }else{
////
////            }
//        }

        private static Map<Character, List<Character>> setMap(Map<Character, List<Character>> map) {
            List<Character> list2 = new ArrayList<>();
            list2.add('a');
            list2.add('b');
            list2.add('c');
            map.put('2',list2);

            List<Character> list3 = new ArrayList<>();
            list3.add('d');
            list3.add('e');
            list3.add('f');
            map.put('3',list3);

            List<Character> list4 = new ArrayList<>();
            list4.add('g');
            list4.add('h');
            list4.add('i');
            map.put('4',list4);

            List<Character> list5 = new ArrayList<>();
            list5.add('j');
            list5.add('k');
            list5.add('l');
            map.put('5',list5);

            List<Character> list6 = new ArrayList<>();
            list6.add('m');
            list6.add('n');
            list6.add('o');
            map.put('6',list3);


            List<Character> list7 = new ArrayList<>();
            list7.add('p');
            list7.add('q');
            list7.add('r');
            list7.add('s');
            map.put('7',list7);


            List<Character> list8 = new ArrayList<>();
            list8.add('t');
            list8.add('u');
            list8.add('v');
            map.put('8',list8);

            List<Character> list9 = new ArrayList<>();
            list9.add('w');
            list9.add('x');
            list9.add('y');
            list9.add('z');
            map.put('9',list9);
            return map;
        }
    }
}
