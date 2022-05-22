
package other;

/**
 * @author zard
 * @date Created in 21/04/2022 05:25
 */
public class Other42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] height = {4,2,0,3,2,5};
        int s = Solution.trap(height);
        System.out.println(s);
    }

    static class Solution {
        public static int trap(int[] height) {
            int count = 0;
            int left = 0;
            int right = height.length - 1;
            int maxLeft = height[left];
            int maxRight = height[right];
            while(left < right){
                if(maxLeft < maxRight){
                    left++;
                    maxLeft = Math.max(maxLeft,height[left]);
                    System.out.println("count :" + count);
                    count += maxLeft - height[left];
                }else{
                    right--;
                    maxRight = Math.max(maxRight,height[right]);
                    System.out.println("count :" + count);
                    count += maxRight - height[right];
                }

            }
            return count;
        }
    }
}



























//            for (int i = res.length - 1; i >= 0; i--) {
//                int count = 0;
//                int j = 0;
//                if(length1 > length2){
//                    if(i > length1 - 1){
//                        count = Integer.parseInt(charNum2[j] + "") + res[i];
//                    } else if(i > length2 - 1){
//                        count = Integer.parseInt(charNum1[i] + "") + res[i];
//                    }else{
//                        count = Integer.parseInt(charNum1[i] + "")
//                                + Integer.parseInt(charNum2[j] + "") + res[i];
//                    }
//                }else{
//                    if(i > length1 - 1){
//                        count = Integer.parseInt(charNum2[i] + "") + res[i];
//                    } else if(i > length2 - 1){
//                        count = Integer.parseInt(charNum1[j] + "") + res[i];
//                    }else{
//                        count = Integer.parseInt(charNum1[j] + "")
//                                + Integer.parseInt(charNum2[i] + "") + res[i];
//                    }
//                }
//                j++;
//                if(count < 9){
//                    res[i] = count;
//                }else{
//                    if(count == 10){
//                        res[i] = 0;
//                        res[i + 1] = res[i + 1] + 1;
//                    }else{
//                        res[i] = count - 10;
//                        res[i + 1] = res[i + 1] + 1;
//                    }
//                }
//
//            }
//            for (int i = res.length - 1; i > -1; i--) {
//                result += res[i];
//            }