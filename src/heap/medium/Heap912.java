package heap.medium;

import heap.easy.Heap1337;

import java.util.Stack;

/**
 * @author zard
 * @date Created in 21/04/2022 11:32
 */
public class Heap912 {

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] i = Heap912.Solution.sortArray(nums);
        System.out.println(i);
    }

    static class Solution {
        public static int[] sortArray(int[] nums) {
            quickSort(nums, 0, nums.length-1);
            return nums;
        }

        static void quickSort(int[] nums, int l, int r) {
            if (l >= r) return;
            int pivotIdx = partition(nums, l, r);
            quickSort(nums, l, pivotIdx - 1);
            quickSort(nums, pivotIdx + 1, r);
        }

        static int partition(int[] nums, int l, int r) {
            int i = l, j = r;
            int pivot = nums[j];
            while (i < j) {
                while (i < j && nums[i] <= pivot) {
                    i++;
                }
                if (i < j) {
                    swap(nums, i, j);
                }
                while (i < j && nums[j] >= pivot) {
                    j--;
                }
                if (i < j) {
                    swap(nums, i, j);
                }
            }
            return j;
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
