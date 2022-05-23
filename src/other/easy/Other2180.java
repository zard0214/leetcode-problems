package other.easy;


import recursion.medium.RECURSION17;

public class Other2180 {
    public static void main(String[] args) {
        System.out.println(Solution.countEven(4));
    }


    static class Solution {
        public static int countEven(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if(isEvenDigit(i))
                    count++;
            }
            return count;
        }

        private static boolean isEvenDigit(int i) {
            int count = 0;
            char[] chars = String.valueOf(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                count += chars[j];
            }
            if(count % 2 == 0){
                return true;
            }
            return false;
        }
    }
}
