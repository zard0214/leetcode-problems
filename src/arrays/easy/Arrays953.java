package arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zard
 * @date Created in 20/04/2022 09:52
 */
public class Arrays953 {
    public static void main(String[] args) {
        String[] words = new String[]{"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean alienSorted = Solution.isAlienSorted(words, order);
        System.out.print(alienSorted + " ");
    }

    static class Solution {
        public static boolean isAlienSorted(String[] words, String order) {

            return false;
        }

    }
}
