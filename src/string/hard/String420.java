package string.hard;


/**
 * A password is considered strong if the below conditions are all met:
 *
 * It has at least 6 characters and at most 20 characters.
 * It contains at least one lowercase letter, at least one uppercase letter, and at least one digit.
 * It does not contain three repeating characters in a row (i.e., "...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).
 * Given a string password, return the minimum number of steps required to make password strong. if password is already strong, return 0.
 *
 * In one step, you can:
 *
 * Insert one character to password,
 * Delete one character from password, or
 * Replace one character of password with another character.
 *
 * @author zard
 * @date Created in 17/04/2022 09:01
 */
public class String420 {

    public static void main(String[] args) {
        String password = "aA1";
        int i = Solution.strongPasswordChecker(password);

    }

    static class Solution {
        public static  int strongPasswordChecker(String password) {

            return 0;
        }
    }
}
