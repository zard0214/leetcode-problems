package arrays.easy;

import java.util.HashMap;

/**
 * @author zard
 * @date Created in 20/04/2022 06:42
 */
public class Arrays217 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        boolean oneBitCharacter = Arrays217.Solution.containsDuplicate(nums);
        System.out.println(oneBitCharacter);

    }

    static class Solution {
        public static boolean containsDuplicate(int[] nums) {
            boolean result = false;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.get(nums[i]) == null)
                    map.put(nums[i], 1);
                else{
                    return true;
                }
            }
            return result;
        }
    }
}
