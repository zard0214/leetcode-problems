package arrays.easy;

import java.util.HashMap;

/**
 * @author zard
 * @date Created in 21/04/2022 03:39
 */
public class Arrays169 {
    public static void main(String[] args) {
        int[] nums = {3};
        int i1 = Arrays169.Solution.majorityElement(nums);
        System.out.println(i1);
    }

    static class Solution {
        public static int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.get(nums[i]) == null){
                    map.put(nums[i], 1);
                    if(1 > nums.length / 2)
                        return nums[i];
                }else{
                    Integer integer = map.get(nums[i]);
                    if(integer + 1 > nums.length / 2)
                        return nums[i];
                    map.put(nums[i], integer + 1);
                }
            }
            return 0;
        }
    }
}
