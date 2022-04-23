package arrays.easy;


import java.util.ArrayList;
import java.util.List;

public class Arrays905 {

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        int[] nums2 = Arrays905.Solution.sortArrayByParity(nums);
        for (int i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }

    static class Solution {
        public static int[] sortArrayByParity(int[] nums) {
            int[] result = new int[nums.length];
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] % 2 == 0)
                    even.add(nums[i]);
                else
                    odd.add(nums[i]);
            }
            int index = 0;
            for (int i = 0; i < even.size(); i++) {
                result[index++] = even.get(i).intValue();
            }
            for (int i = 0; i < odd.size(); i++) {
                result[index++] = odd.get(i).intValue();
            }
            return result;
        }
    }
}
