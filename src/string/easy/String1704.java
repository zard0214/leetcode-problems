package string.easy;

/**
 * @author zard
 * @date Created in 15/04/2022 07:32
 */
public class String1704 {
    public static void main(String[] args) {
        String s = "MerryChristmas";
        boolean b = Solution.halvesAreAlike(s);
        System.out.println(b);
    }

    static class Solution {
        public static boolean halvesAreAlike(String s) {
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                for (int j = 0; j < vowels.length; j++) {
                    if(s.charAt(i) == vowels[j]){
                        count1++;
                    }
                }
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                for (int j = 0; j < vowels.length; j++) {
                    if(s.charAt(i) == vowels[j]){
                        count2++;
                    }
                }
            }
            if(count1 != count2)
                return false;
            return true;
        }
    }
}
