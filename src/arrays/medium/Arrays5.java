package arrays.medium;

import arrays.hard.Arrays4;

/**
 * @author zard
 * @date Created in 20/04/2022 10:35
 */
public class Arrays5 {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int alienSorted = Arrays5.Solution.maxArea(height);
        System.out.print(alienSorted + " ");
    }

    static class Solution {
        public static int maxArea(int[] height) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < height.length; i++) {
                for (int j = i; j < height.length; j++) {
                    int sum = 0;
                    if(i != j){
                        sum = (j - i) * (height[i] <= height[j] ? height[i] : height[j]);
                        if(sum > max)
                            max = sum;
                    }
                }
            }
            return max;
        }
    }
}
