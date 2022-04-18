package string.easy;

/**
 * @author zard
 * @date Created in 18/04/2022 11:59
 */
public class String1935 {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        int i = Solution.canBeTypedWords(text, brokenLetters);
        System.out.println(i);
    }

    static class Solution {
        public static int canBeTypedWords(String text, String brokenLetters) {
            String[] words = text.split(" ");
            int num = words.length;
            char[] letters = brokenLetters.toCharArray();
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < letters.length; j++) {
                    if(words[i].contains(letters[j] + "")){
                        num--;
                        break;
                    }
                }
            }
            return num;
        }
    }
}
