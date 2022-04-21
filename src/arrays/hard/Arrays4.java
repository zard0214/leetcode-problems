package arrays.hard;

import arrays.easy.Arrays953;

/**
 * @author zard
 * @date Created in 20/04/2022 10:03
 */
public class Arrays4 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{};
        double alienSorted = Arrays4.Solution.findMedianSortedArrays(nums1, nums2);
        System.out.print(alienSorted + " ");
    }

    static class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double result = 0D;
            int m = nums1.length;
            int n = nums2.length;
            if(m + n == 0)
                return result;
            if(m == 0 && n == 1)
                return nums2[0];
            if(m == 1 && n == 0)
                return nums1[0];
            int[] merged = new int[m + n];
            for (int i = 0; i < m; i++) {
                merged[i] = nums1[i];
            }
            int index = 0;
            for (int i = m; i < m + n; i++) {
                merged[i] = nums2[index++];
            }
            for (int i = 0; i < m + n - 1; i++)
                for (int j = 0; j < m + n - i - 1; j++)
                    if (merged[j] > merged[j + 1]) {
                        int temp = merged[j];
                        merged[j] = merged[j + 1];
                        merged[j + 1] = temp;
                    }
            for (int i = 0; i <  m + n; i++)
                System.out.print(merged[i] + " ");
            System.out.println();
            if((m + n) % 2 == 1){
                result = merged[(m + n) / 2];
                return result;
            }else{
                return ((double) merged[(m + n) / 2 - 1] + (double) merged[(m + n) / 2]) / 2;
            }
        }
    }
}
