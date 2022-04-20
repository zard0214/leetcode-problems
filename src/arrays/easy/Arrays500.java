package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zard
 * @date Created in 20/04/2022 05:13
 */
public class Arrays500 {

    public static void main(String[] args) {
        String[] words = {"adsdf", "sfd"};
        String[] words1 = Solution.findWords(words);
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i]);
        }

    }

    static class Solution {
        public static String[] findWords(String[] words) {
            List<String> resultList = new ArrayList<>();
            List alphabetQList = new ArrayList<>();
            alphabetQList.add('q');
            alphabetQList.add('w');
            alphabetQList.add('e');
            alphabetQList.add('r');
            alphabetQList.add('t');
            alphabetQList.add('y');
            alphabetQList.add('u');
            alphabetQList.add('i');
            alphabetQList.add('o');
            alphabetQList.add('p');
            List alphabetQList2 = new ArrayList<>();
            alphabetQList2.add('Q');
            alphabetQList2.add('W');
            alphabetQList2.add('E');
            alphabetQList2.add('R');
            alphabetQList2.add('T');
            alphabetQList2.add('Y');
            alphabetQList2.add('U');
            alphabetQList2.add('I');
            alphabetQList2.add('O');
            alphabetQList2.add('P');
            List alphabetAList = new ArrayList<>();
            alphabetAList.add('a');
            alphabetAList.add('s');
            alphabetAList.add('d');
            alphabetAList.add('f');
            alphabetAList.add('g');
            alphabetAList.add('h');
            alphabetAList.add('j');
            alphabetAList.add('k');
            alphabetAList.add('l');
            List alphabetAList2 = new ArrayList<>();
            alphabetAList2.add('A');
            alphabetAList2.add('S');
            alphabetAList2.add('D');
            alphabetAList2.add('F');
            alphabetAList2.add('G');
            alphabetAList2.add('H');
            alphabetAList2.add('J');
            alphabetAList2.add('K');
            alphabetAList2.add('L');
            List alphabetZList = new ArrayList<>();
            alphabetZList.add('z');
            alphabetZList.add('x');
            alphabetZList.add('c');
            alphabetZList.add('v');
            alphabetZList.add('b');
            alphabetZList.add('n');
            alphabetZList.add('m');
            List alphabetZList2 = new ArrayList<>();
            alphabetZList2.add('Z');
            alphabetZList2.add('X');
            alphabetZList2.add('C');
            alphabetZList2.add('V');
            alphabetZList2.add('B');
            alphabetZList2.add('N');
            alphabetZList2.add('M');
            for (int i = 0; i < words.length; i++) {
                char[] word = words[i].toCharArray();

                int countQ=0;
                int countA=0;
                int countZ=0;
                for (int j = 0; j < word.length; j++) {
                    if(alphabetQList.contains(word[j])
                            ||alphabetQList2.contains(word[j]))
                        countQ++;
                    if(alphabetAList.contains(word[j])
                            ||alphabetAList2.contains(word[j]))
                        countA++;
                    if(alphabetZList.contains(word[j])
                            ||alphabetZList2.contains(word[j]))
                        countZ++;
                }
                if(countQ == word.length || countA == word.length
                        || countZ == word.length)
                    resultList.add(words[i]);
            }

            String[] result = new String[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }
            return result;
        }
    }
}
