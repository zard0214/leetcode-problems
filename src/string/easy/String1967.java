package string.easy;

/**
 * @author zard
 * @date Created in 04/10/2021 16:28
 */
public class String1967 {

    public static void main(String[] args) {
        String[] patterns = {"hvzoo","r","hyjcrgzr","yvqahvz","org","yvqahvz","org","oor",
                "gxe","zo","ahvzoo","ahvzo","r","o","caviikty","pkxlcaams"};
        String word = "tyvqahvzoorga";
        int i = Solution.numOfStrings(patterns, word);
        System.out.println(i);
    }

    static class Solution {
        public static int numOfStrings(String[] patterns, String word) {
            int count = 0;
            int[] psf;
            for (int i = 0; i < patterns.length; i++) {
                psf = new int[patterns[i].length()];
                String pattern = patterns[i];
                int P = pattern.length();
                int W = word.length();
                computerPSF(psf, pattern, P);
                int k = 0; //pattern index
                int z = 0; //word index
                while (z < W){
                    if(pattern.charAt(k) == word.charAt(z)){
                        k ++;
                        z ++;
                    }
                    if(k == P){
                        count ++;
                        z = W;
                    }
                    if(z < W && pattern.charAt(k) != word.charAt(z)){
                        if(k > 0){
                            k = psf[k - 1];
                        }else {
                            z ++;
                        }
                    }
                }
            }

            return count;
        }

        private static void computerPSF(int[] psf, String pattern, int P) {
            int i = 0;
            int j = 1;
            psf[0] = 0;
            while (j < P){
                if(pattern.charAt(i) == pattern.charAt(j)){
                    i ++;
                    psf[j] = i;
                    j ++;
                }else if(pattern.charAt(i) != pattern.charAt(j)){
                    if(i > 0){
                        psf[i] = psf[j - 1];
                        i = 0;
                    }else{
                        psf[i] = 0;
                        j ++;
                    }
                }
            }
        }
    }
}
