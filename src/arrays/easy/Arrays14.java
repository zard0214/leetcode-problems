package arrays.easy;


/**
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * @author zard
 * @date Created in 21/04/2022 09:37
 */
public class Arrays14 {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String ints = Arrays14.Solution.longestCommonPrefix(strs);
        System.out.print(ints);
    }

    static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            String prefix = "";
            int min = Integer.MAX_VALUE;
            int len = strs.length;
            for(int i = 0;i < len;i ++){
                String s = strs[i];
                min = Math.min(min,s.length());
            }
            for(int i = min;i >= 0;i--){
                int index = 1;
                String sub1 = strs[0].substring(0,i);
                for(int j=1;j<len;j++){
                    String tmp = strs[j];
                    String sub = tmp.substring(0,i);
                    if(sub.equals(sub1)){
                        index++;
                    }
                    else{
                        break;
                    }
                }
                if(index == len)
                    return sub1;
            }
            return prefix;
        }
    }
}
