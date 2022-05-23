package other.easy;


import java.util.*;

public class Other884 {
    public static void main(String[] args) {
        String s1 = "apple apple", s2 = "banana";
        String[] strings = Solution.uncommonFromSentences(s1, s2);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }


    static class Solution {

        public static String[] uncommonFromSentences(String s1, String s2) {
            String[] s1a = (s1 + " " + s2).split(" ");
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < s1a.length; i++) {
                if(map.get(s1a[i]) != null){
                    map.put(s1a[i], map.get(s1a[i]) + 1);
                }else{
                    map.put(s1a[i], 1);
                }
            }
            List<String> list = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map.entrySet())
               if(entry.getValue() == 1)
                   list.add(entry.getKey());
            int size = list.size();
            String[] result = new String[size];
            for (int i = 0; i <  size; i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
