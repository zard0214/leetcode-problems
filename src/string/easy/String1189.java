package string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zard
 * @date Created in 06/10/2021 15:50
 */
public class String1189 {


    public static void main(String[] args) {
        String text = "mbetypbpefxvviadqaodrbjeoacfomepmzymiudltgnvnpbowwmjgpzzhtiismearuwocsgbiimiqqzaozgeizikrlxmupfzjzmlfttqqbpfblqfkecsdfbsceqjhubfxksivrfwvukapxmuciybfhzlmpeamdxziptxregymqtmgcsujmugissgnlbhxbcxxeoumcqyulvahuianbaaxgzrtmshjguqdaxvxndzoqvwmcjfhpevavnrciqbymnlylbrfkkiceienoarfrzzxtuaqapaeqeqolozadmtgjyhfqzpuaskjuawxqkdqyjqcmbxtvshzrquvegcuyuckznspmrxvqdassidcmrajedsnuuumfwqzvasljlyvfefktiqgvzvdzojtjegsyhbepdkuwvgrfscezvswywmdavpxlekbrlkfnbyvlobazmvgulxrfdranuhomkrlpbfeagfxxxuhjuqhbkhznixquxrxngwimdxdhqbdaouitsvcdmbwxbbaomkgxsqwnexbjjyhtxvkjfqkrrxjghvzqsattubphryqxxdyjkihfnzvjhohnhdlfwoqiwtmwzfgcyhyqtcketvgnbchcxvnhcsoosirfqgdgcsitegzlxdfijzmxnvhrulmgvoqfpzesootscnxenokmmozmoxpaverydbsnimwacjqhrtxkqtvghjyushoctxphxzztukgmnoeycqaeukymvwxcsyvvctflqjhtcvjtxncuvhkptkjnzaetwbzkwnseovewuhpkaxiphdicgacszzdturzgjkzwgkmzzavykancvvzaafgzjhcyicorrblmhsnnkhfkujttbkuuedhwguuaapojmnjdfytdhrepjwcddzsoeutlbbljlikghxefgbqenwamanikmynjcupqpdjnhldaixwygcvsgdkzszmsptqqnroflgozblygtiyaxudwmooiviqcosjfksnevultrf";
        int s1 = Solution.maxNumberOfBalloons(text);
        System.out.println(s1);
    }

    static class Solution {
        public static int maxNumberOfBalloons(String text) {
            //balloon
            Map<Character, Integer> charMap = new HashMap<>();
            charMap.put('b', 0);
            charMap.put('a', 0);
            charMap.put('l', 0);
            charMap.put('o', 0);
            charMap.put('n', 0);
            char[] chars = text.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(charMap.get(chars[i]) != null)
                    charMap.put(chars[i], charMap.get(chars[i]) + 1);
            }
            int max = 0, min = 0;
            max = Math.min(charMap.get('b'), charMap.get('a'));
            max = Math.min(max, charMap.get('l'));
            max = Math.min(max, charMap.get('n'));

            min = Math.min(charMap.get('l'), charMap.get('o'));

            if(min >= 2 * max)
                return max;
            else{
                max = min / 2;
            }
            return max;
        }
    }

}
