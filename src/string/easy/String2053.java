package string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zard
 * @date Created in 15/04/2022 12:53
 */
public class String2053 {
    public static void main(String[] args) {
        String[] arr = {"a","a"};
        int k = 1;
        Object s = String2053.Solution.kthDistinct(arr, k);
        System.out.println(s);
    }

    static class Solution {
        public static Object kthDistinct(String[] arr, int k) {
            List<String> result = new ArrayList<>();
            List<String> result2 = new ArrayList<>();
            List<Integer> index = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j].equals(arr[i])){
                        index.add(i);
                        index.add(j);
                    }
                }
                result.add(arr[i]);
            }

            for (int i = 0; i < index.size(); i++) {
                result2.add(arr[index.get(i).intValue()]);
            }
            result.removeAll(result2);
            if(result.size() == 0)
                return "";
            if(result.size() >= k - 1)
                return result.get(k - 1);
            else
                return "";
        }
    }
}
