package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 22:00
 */
public class Arrays1528 {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        String ss= Arrays1528.Solution.restoreString(s,indices);
        System.out.println(ss);
    }

    static class Solution {
//        public static String restoreString(String s, int[] indices) {
//            char[] res = new char[s.length()];
//            char[] r = s.toCharArray();
//            for (int i = 0; i < indices.length; i++) {
//                for (int j = 0; j < indices.length; j++) {
//                    if(indices[j] == i){
//                        res[i] = r[j];
//                    }
//                }
//            }
//            StringBuffer str = new StringBuffer();
//            for (char item : res) {
//                str.append(item);
//            }
//            return str.toString();
//        }

        public static String restoreString(String s, int[] indices) {
            int len = s.length();
            StringBuilder sb = new StringBuilder(s);
            for(int i = 0 ; i < len; i++){
                sb.setCharAt(indices[i], s.charAt(i));
            }
            return sb.toString();
        }
    }
}
