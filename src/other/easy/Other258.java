package other.easy;


import java.util.ArrayList;
import java.util.List;

public class Other258 {
    public static void main(String[] args) {

        System.out.println(Solution.isHappy(3));
    }


    static class Solution {

        public static boolean isHappy(int num) {
            if(isHappy2(num) == 1)
                return true;
            return false;
        }

        public static int isHappy2(int num) {
            try {
                String s = num + "";
                char[] chars = s.toCharArray();
                int count = 0;
                for (int i = 0; i < chars.length; i++) {
                    count += Integer.parseInt(chars[i] + "") * Integer.parseInt(chars[i] + "");
                }
                if(count == 1){
                    return 1;
                }
                return isHappy2(count);
            }catch (StackOverflowError e){
                return 0;
            }
        }
    }
}
