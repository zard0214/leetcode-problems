package arrays.easy;


import java.util.HashSet;
import java.util.Set;

/**
 * @author zard
 * @date Created in 21/04/2022 10:14
 */
public class Arrays2085 {

    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        int solution = Arrays2085.Solution.countWords(words1, words2);
        System.out.println(solution);
    }

    static class Solution {
        public static int countWords(String[] words1, String[] words2) {
            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();
            for(String i : words1){
                set1.add(i);
            }
            for(String i : words2){
                set2.add(i);
            }
            set1.retainAll(set2);
            Object[] arr = set1.toArray();
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < words1.length; j++) {
                    if(arr[i].toString().equals(words1[j]))
                        count++;
                }
                for (int j = 0; j < words2.length; j++) {
                    if(arr[i].toString().equals(words2[j]))
                        count++;
                }
                if(count == 2)
                    result++;
            }
            return result;
        }
    }
}
