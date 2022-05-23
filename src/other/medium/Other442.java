package other.medium;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Other442 {
    public static void main(String[] args) {
//        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1};
        System.out.println(Solution.findDuplicates(nums));
    }


    static class Solution {
        //root = [1,null,3,2,4,null,5,6]
        //[[1],[3,2,4],[5,6]]
        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if(!set.add(nums[i])){
                    result.add(nums[i]);
                }
            }
            return result;
        }
    }
}
