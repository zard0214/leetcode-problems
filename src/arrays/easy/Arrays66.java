package arrays.easy;

import java.util.Scanner;

/**
 * @author zard
 * @date Created in 27/09/2021 10:39
 */
public class Arrays66 {

    public static void main(String[] args) {
        Scanner SK = new Scanner(System.in);
        String s = SK.nextLine();
        System.out.println(s);
        SK.nextLine();
    }

    static class Solution {
        public static int[] plusOne(int[] digits) {
            int len = digits.length;
            int[] res = new int[len + 1];
            if(digits[len - 1] == 9){
                for (int i = len - 1; i >= 0; i --) {
                    if(i == 0){
                        res[0] = 1;
                        for (int j = 0; j < len; j++) {
                            if(digits[j] == 9){
                                res[j + 1] = 0;
                            }else{
                                res[j + 1] = digits[j] + 1;
                            }
                        }
                        return res;
                    }
                    if(digits[i - 1] != 9){
                        continue;
                    }else{
                        res[i - 1] = 0;
                    }
                }
            }else{
                digits[len - 1] = digits[len - 1] + 1;
                return digits;
            }
            return digits;
        }
    }
}
