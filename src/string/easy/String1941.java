package string.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zard
 * @date Created in 18/04/2022 20:08
 */
public class String1941 {

    public static void main(String[] args) {
        String s = "mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm";
        boolean i = Solution.areOccurrencesEqual(s);
        System.out.println(i);
    }

    static class Solution {
        public static boolean areOccurrencesEqual(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(map.get(chars[i]) == null){
                    map.put(chars[i], 1);
                } else{
                    Integer integer = map.get(chars[i]);
                    integer ++;
                    map.put(chars[i], integer);
                }
            }
            List<Integer> value = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                value.add(entry.getValue());
            }
            System.out.println();
            for (int i = 0; i < value.size(); i++) {
                if(i != value.size() - 1){
                    if(value.get(i).compareTo( value.get(i + 1)) != 0){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
