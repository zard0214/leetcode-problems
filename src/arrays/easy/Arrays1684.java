package arrays.easy;

/**
 * @author zard
 * @date Created in 19/04/2022 13:08
 */
public class Arrays1684 {

    public static void main(String[] args) {
        String allowed = "fstqyienx";

        String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        int i = Arrays1684.Solution.countConsistentStrings(allowed, words);
        System.out.println(i);
    }

    static class Solution {
        public static int countConsistentStrings(String allowed, String[] words) {
            int count = words.length;
            Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                    'o','p','q','r','s','t','u','v','w','x','y','z'};
            char[] allow = allowed.toCharArray();
            for (int j = 0; j < alphabet.length; j++) {
                for (int i = 0; i < allow.length; i++) {
                    if(alphabet[j] != null)
                        if(allow[i] == alphabet[j].charValue()){
                            alphabet[j] = null;
                        }
                }
            }
            for (int i = 0; i < words.length; i++) {
                boolean remove = false;
                for (int j = 0; j < alphabet.length; j++) {
                    if(alphabet[j] != null){
                        if(words[i].contains(alphabet[j] + "")){
                            remove = true;
                        }
                    }
                }
                if(remove)
                    count--;
            }
            return count;
        }
    }
}
