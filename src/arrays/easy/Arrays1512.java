package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 20:45
 */
public class Arrays1512 {

    public static void main(String[] args) {
        int[] nums = {1};
        int i = Solution.numIdenticalPairs(nums);
        System.out.println(i);
    }

    static class Solution {
        public static int numIdenticalPairs(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1 ; j < nums.length ; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
