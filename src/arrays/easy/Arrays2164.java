package arrays.easy;


import java.util.*;

public class Arrays2164 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{1};
        int[] intersect = Solution.intersect(nums1, nums2);
        for (int i = 0; i < intersect.length; i++)
            System.out.print(intersect[i] + " ");
    }

    static class Solution {
        public static int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if(nums1[i] == nums2[j]
                    && nums1[i] != Integer.MIN_VALUE
                            && nums2[j] != Integer.MIN_VALUE){
                        list.add(nums1[i]);
                        nums1[i] = Integer.MIN_VALUE;
                        nums2[j] = Integer.MIN_VALUE;
                    }
                }
            }
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
