package string.easy;

/**
 * @author zard
 * @date Created in 16/04/2022 08:05
 */
public class String2114 {
    public static void main(String[] args) {
        String[] s = {"please wait", "continue to fight", "continue to win"};
        int anagram = Solution.mostWordsFound(s);
        System.out.println(anagram);
    }

    static class Solution {
        public static int mostWordsFound(String[] sentences) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < sentences.length; i++) {
                String[] s = sentences[i].split(" ");
                int length = s.length;
                if(max < length){
                    max = length;
                }
            }
            return max;
        }
    }
}
