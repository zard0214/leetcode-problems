package string.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zard
 * @date Created in 27/09/2021 08:51
 */
public class String1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int i = Solution.sumOfUnique(nums);
        System.out.println(i);
    }

    static class Solution {

        public static int sumOfUnique(int[] arr) {
            int sum = 0;
            int len = arr.length;
            Set set = new HashSet();
            for (int i = 0; i < len-1; i ++)
                for (int j = 0; j < len-i-1; j++)
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            for (int i = 0; i < len; i++) {
                set.add(arr[i]);
            }
            for (int i = 0; i < len - 1; i++) {
                if(arr[i] == arr[i + 1]){
                    set.remove(arr[i]);
                }
            }
            for (Object s: set) {
                sum += Integer.valueOf((Integer) s);
            }
            return sum;
        }
    }
}
