package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 24/09/2021 10:15
 */
public class Arrays1431 {
    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> res = Arrays1431.Solution.kidsWithCandies(candies, extraCandies);
        for (Boolean item : res
        ) {
            System.out.println(item);
        }

    }

    static class Solution {
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;
            List<Boolean> ans = new ArrayList<>();
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] > max) {
                    max = candies[i];
                }
            }
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies >= max) {
                    ans.add(true);
                } else {
                    ans.add(false);
                }
            }
            return ans;
        }
    }
}
