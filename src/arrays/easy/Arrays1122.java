package arrays.easy;

import java.util.HashMap;

/**
 * @author zard
 * @date Created in 20/04/2022 06:58
 */
public class Arrays1122 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        int[] ints = Solution.relativeSortArray(arr1, arr2);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    static class Solution {
        public static int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] result = new int[arr1.length];
            int[] unput = new int[arr1.length];
            int index = 0;
            int index2 = 0;
            int count1 = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        result[index++] = arr2[i];
                    }
                }
            }
            for (int j = 0; j < arr1.length; j++) {
                int count = 0;
                for (int i = 0; i < arr2.length; i++) {
                    if (arr2[i] == arr1[j]) {
                        count++;
                    }
                }
                if (count == 0) {
                    unput[index2++] = arr1[j];
                    count1++;
                }
            }
            for (int i = 0; i < count1 - 1; i++)
                for (int j = 0; j < count1 - i - 1; j++)
                    if (unput[j] > unput[j + 1]) {
                        int temp = unput[j];
                        unput[j] = unput[j + 1];
                        unput[j + 1] = temp;
                    }
            index = 0;
            for (int i = arr1.length - count1; i < arr1.length; i++) {
                result[i] = unput[index++];
            }
            return result;
        }
    }
}
