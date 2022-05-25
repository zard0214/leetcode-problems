package string.easy;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String824 {

    public static void main(String[] args) {
//        String sentence = "I speak Goat Latin";
        String sentence = "The quick brown fox jumped over the lazy dog";
        String s1 = Solution.toGoatLatin(sentence);
        System.out.println(s1);
    }

    static class Solution {
        public static String toGoatLatin(String sentence) {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = convert(words[i], i);
            }
            String result = "";
            for (int i = 0; i < words.length; i++) {
                result += words[i] + " ";
            }

            return result.substring(0, result.length() - 1);
        }

        private static String convert(String word, int index) {
            if(!(word.startsWith("a") || word.startsWith("e") ||
                word.startsWith("i") || word.startsWith("o") ||
                    word.startsWith("u") || word.startsWith("A") ||
                    word.startsWith("E") || word.startsWith("I") ||
                    word.startsWith("O") || word.startsWith("U") )) {
                String substring = word.substring(0, 1);
                String substring2 = word.substring(1);
                word = substring2 + substring;
            }
            word += "ma";
            for (int i = 0; i < index + 1; i++)
                word += "a";
            return word;
        }
    }
}
