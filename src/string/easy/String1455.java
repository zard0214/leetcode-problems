package string.easy;


/**
 * @author zard
 * @date Created in 18/04/2022 13:17
 */
public class String1455 {
    public static void main(String[] args) {
        String sentence = "i am tired";
        String searchWord = "you";
        int s = Solution.isPrefixOfWord(sentence, searchWord);
        System.out.println(s);
    }

    static class Solution {
        public static int isPrefixOfWord(String sentence, String searchWord) {
            int result = -1;
            String[] s = sentence.split(" ");
            for (int i = 0; i < s.length; i++) {
                if(s[i].startsWith(searchWord)){
                    result = i + 1;
                    return result;
                }
            }
            return result;
        }
    }
}
