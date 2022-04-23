package arrays.easy;


/**
 * @author zard
 * @date Created in 20/04/2022 11:20
 */
public class Arrays704 {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int search = Solution.search(nums, target);
        System.out.println(search);
    }

    static class Solution {
        public static int search(int[] nums, int target) {
            return bisection(nums, 0 , nums.length - 1, target);
        }

        static int bisection(int array[], int left, int right, int k){
            int m = (left + right) / 2;
            if(left > right){
                return  - 1;
            }
            if(array[m] == k){
                return m;
            }else{
                if(array[m] < k){
                    return bisection(array, m + 1, right, k);
                }else{
                    return bisection(array, left, m - 1, k);
                }
            }
        }
    }
}
