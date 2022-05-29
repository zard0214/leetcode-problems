package arrays.easy;


/**
 * DFS maybe
 * @author zard
 * @date Created in 21/04/2022 03:21
 */
public class Arrays1588 {

    public static void main(String[] args) {
        int[] arr = {10,11,12};
        int count = Solution.sumOddLengthSubarrays(arr);
        System.out.println(count);
    }

    static class Solution {
        public static int sumOddLengthSubarrays(int[] arr) {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                int length = 1;
                while (length <= arr.length){
                    if(arr.length - i >= length)
                    for (int j = i; j < i + length; j++) {
                        result += arr[j];
                    }
                    length += 2;
                }
            }
            return result;
        }
    }
}
