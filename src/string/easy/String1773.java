package string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zard
 * @date Created in 15/04/2022 07:04
 */
public class String1773 {

    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();
        List<String> arr1 = new ArrayList<>();
        arr1.add("phone");
        arr1.add("blue");
        arr1.add("pixel");
        arr.add(arr1);
        List<String> arr2 = new ArrayList<>();
        arr2.add("computer");
        arr2.add("silver");
        arr2.add("phone");
        arr.add(arr2);
        List<String> arr3 = new ArrayList<>();
        arr3.add("phone");
        arr3.add("gold");
        arr3.add("iphone");
        arr.add(arr3);

        String ruleKey = "color";
        String ruleValue = "silver";
        int i = String1773.Solution.countMatches(arr, ruleKey,
                ruleValue);
        System.out.println(i);
    }

    static class Solution {
        public static int countMatches(List<List<String>> items, String ruleKey,
                                       String ruleValue) {
            int matchCount=0;
            if(ruleKey.equals("type")){
                for(int i=0;i<items.size();i++){
                    if(items.get(i).get(0).equals(ruleValue))
                        matchCount++;
                }
            }else if(ruleKey.equals("color")){
                for(int i=0;i<items.size();i++){
                    if(items.get(i).get(1).equals(ruleValue))
                        matchCount++;
                }
            }else if(ruleKey.equals("name")){
                for(int i=0;i<items.size();i++){
                    if(items.get(i).get(2).equals(ruleValue))
                        matchCount++;
                }
            }
            return matchCount++;
        }
    }
}
