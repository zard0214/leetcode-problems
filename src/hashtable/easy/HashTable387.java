package hashtable.easy;


/**
 * @author zard
 * @date Created in 21/04/2022 04:05
 */
public class HashTable387 {
    public static void main(String[] args) {
        String s = "bbbbbba";
        int i1 = HashTable387.Solution.firstUniqChar(s);
        System.out.println(i1);
    }

    static class Solution {
        public static int firstUniqChar(String s) {
            int result = -1;
            if(s.length() == 1)
                return 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if(i != j){
                        if(s.charAt(i) == s.charAt(j)){
                            s = s.replace(s.charAt(i), '$');
                            break;
                        }
                    }
                    if(j == s.length() - 1)
                        return i;
                }
            }
            return result;
        }
    }
}
