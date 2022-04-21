package arrays.easy;

import java.util.HashMap;

/**
 * @author zard
 * @date Created in 20/04/2022 07:39
 */
public class Arrays136 {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int ints = Arrays136.Solution.singleNumber(nums);
        System.out.print(ints);
    }

    static class Solution {
        public static int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.get(nums[i]) == null)
                    map.put(nums[i], 1);
                else{
                    map.put(nums[i],map.get(nums[i]) + 1);
                }
            }
            for(Integer key :map.keySet()){
                if(map.get(key) == 1)
                    return key;
            }
            return -1;
        }
    }
}
