package string.easy;

/**
 * @author zard
 * @date Created in 26/09/2021 19:48
 */
public class String1108 {

//    Input: address = "1.1.1.1"
//    Output: "1[.]1[.]1[.]1"
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String s = Solution.defangIPaddr(address);
        System.out.println(s);
    }

    static class Solution {
        public static String defangIPaddr(String address) {
            return address.replace(".","[.]");
        }
    }

}
