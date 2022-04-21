package arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zard
 * @date Created in 20/04/2022 08:51
 */
public class Arrays1636 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,2,3};
        int ints[] = Arrays1636.Solution.frequencySort(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.print     (ints[i] + " ");
        }
    }

    static class Solution {
        public static int[] frequencySort(int[] nums) {
            int[] result = new int[nums.length];
            int[] result2 = new int[nums.length];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.get(nums[i]) == null)
                    map.put(nums[i], 1);
                else
                    map.put(nums[i], map.get(nums[i]) + 1);
            }
            int index = 0;
            for (int i = 1; i <= 100; i++) {
                Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
                int count = 0;
                for (Map.Entry entry: entries){
                    if(0 == (((Integer) entry.getValue()).compareTo(i))){
                        result[count++] = (int) entry.getKey();
                    }
                }
                int n = count;
                if(n != 0){
                    for (int k = 0; k < n - 1; k++)
                    for (int j = 0; j < n - k - 1; j++)
                        if (result[j] < result[j + 1]) {
                            int temp = result[j];
                            result[j] = result[j + 1];
                            result[j + 1] = temp;
                        }
                }
                for (int k = 0; k < count; k++) {
                    for (int j = 0; j < i; j++) {
                        result2[index++] = result[k];
                    }
                }
            }
            return result2;
        }


    }
}
