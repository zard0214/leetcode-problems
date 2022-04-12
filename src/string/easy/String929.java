package string.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zard
 * @date Created in 03/10/2021 09:17
 */
public class String929 {

    public static void main(String[] args) {
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int i = Solution.numUniqueEmails(emails);
        System.out.println(i);
    }

    static class Solution {
        public static int numUniqueEmails(String[] emails) {
            for (int i = 0; i < emails.length; i++) {
                String[] split = emails[i].split("@");
                String t = split[0].replaceAll("\\.", "");
                String[] split2 = t.split("\\+");
                t = split2[0];
                emails[i] = t + "@" +split[1];

            }
            Set<String> set = new HashSet<>();
            for (int i = 0; i < emails.length; i++) {
                System.out.println(emails[i]);
                set.add(emails[i]);
            }
            return set.size();
        }
    }
}
