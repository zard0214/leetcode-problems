package string.easy;

/**
 * @author zard
 * @date Created in 26/09/2021 20:38
 *  need to optimize
 */
public class String1859 {
    public static void main(String[] args) {
        String s = "QcGZ4 TFJStgu3 HvsRImLBfHd8 PaGqsPNo9 mZwxlrYzanuVOUZoyNjt1 fzhdtYIen6 mV7 LKuaOtefsixxo5 pwdEK2";
        String s1 = String1859.Solution.sortSentence(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String sortSentence(String s) {
            char[] chars = s.toCharArray();
            int len = s.length();
            String[][] resC = new String[10][1];
            for (int i = 0; i < len; i++) {
                if(chars[i] >= '0' && chars[i] <= '9' ){
                    for (int j = 1; j < 10; j++) {
                        if(String.valueOf(chars[i]).equals(String.valueOf(j))){
                            int index = i;
                            for (int k = index; k >= 0 ; k--) {
                                if(' ' != chars[index]){
                                    index--;
                                }
                            }
                            resC[chars[i] - '0'][0] = s.substring(index + 1, i);
                        }else{
                            continue;
                        }
                    }
                }
            }
            String res = "";
            for (int i = 1; i < 10; i++) {
                if(resC[i][0] != null){
                    res += (resC[i][0] + " ");
                }else{
                    break;
                }
            }
            return res.substring(0, res.length() - 1);
        }
    }
}
