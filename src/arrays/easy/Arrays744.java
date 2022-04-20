package arrays.easy;

/**
 * @author zard
 * @date Created in 20/04/2022 02:44
 */
public class Arrays744 {

    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        char target = 'j';
        char c = Solution.nextGreatestLetter(letters, target);
        System.out.println(c);

    }

    static class Solution {
        public static char nextGreatestLetter(char[] letters, char target) {
            char result = letters[0];
            int max = 26;
            for (int i = 0; i < letters.length; i++) {
                if(letters[i] - target > 0){
                    if(letters[i] - target < max){
                        max = letters[i] - target;
                        result = letters[i];
                    }
                }
            }
            return result;
        }
    }
}
