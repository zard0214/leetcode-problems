package string.easy;

import java.util.Stack;

/**
 * @author zard
 * @date Created in 06/10/2021 15:50
 */
public class String1678 {

//    Input: s = "(abcd)"
//    Output: "dcba"

//    Input: s = "(u(love)i)"
//    Output: "iloveu"
//    Explanation: The substring "love" is reversed first, then the whole string is reversed.

//    Input: s = "(ed(et(oc))el)"
//    Output: "leetcode"
//    Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

    public static void main(String[] args) {
        //Input: s = "G()(al)"
        //Output: "Goal"
        String s = "(al)G(al)()()G";
        //Output: "Gooooal"
        //Input: s = "(al)G(al)()()G"
        //Output: "alGalooG"
        String s1 = Solution.interpret(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String interpret(String s) {
            String result = "";
            String o = s.replace("()", "o");
            String s1 = o.replace("G", "G");
            result = s1.replace("(al)", "al");
            return result;
        }
    }

}
