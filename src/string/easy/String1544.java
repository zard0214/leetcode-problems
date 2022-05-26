package string.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String1544 {

    public static void main(String[] args) {
        String s = "Pp";
        String s1 = Solution.makeGood(s);
        System.out.println(s1);
    }

    static class Solution {
        public static String makeGood(String s) {
            char[] chars = s.toCharArray();
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                list.add(chars[i]);
            }
            int length = chars.length;
            int index = 0;
            while (index < length - 1){
                if(list.get(index + 1) - list.get(index) == -32 ||
                        list.get(index + 1) - list.get(index) == 32){
                    list.set(index + 1, '0');
                    list.set(index, '0');
                    Iterator<Character> iterator = list.iterator();
                    while (iterator.hasNext()){
                        Character pre = iterator.next();
                        if(pre == '0'){
                            iterator.remove();
                        }
                    }
                    length -= 2;
                    index = 0;
                    continue;
                }
                index++;
            }
            String result = "";
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i);
            }
            return result;
        }
    }
}
