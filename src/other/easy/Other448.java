package other.easy;


import java.util.*;

public class Other448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        int[] nums = {1,1};
        System.out.println(Solution.findDisappearedNumbers(nums));
    }


    static class Solution {
        public static List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for (int i = 1; i <= nums.length; i++) {
                int finalI = i;
                if(!Arrays.stream(nums).anyMatch(item -> item == finalI)){
                    result.add(i);
                }
            }
            return result;
        }
    }
}
