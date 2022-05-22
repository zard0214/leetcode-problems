package heap.medium;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zard
 * @date Created in 21/04/2022 11:32
 */
public class Heap451 {

    public static void main(String[] args) {
        String s = "trrree";
        String i = Heap451.Solution.frequencySort(s);
        System.out.println(i);
    }

    static class Solution {
        public static String frequencySort(String s) {

            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0;i < s.length();i++){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            }

            List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

            Collections.sort(list,((o1, o2) -> (o2.getValue() - o1.getValue())));

            StringBuilder sb = new StringBuilder();

            for(Map.Entry<Character,Integer> entry:  list){
                for (int i = 0; i < entry.getValue() ; i++) {
                    sb.append(entry.getKey());
                }
            }
            return sb.toString();
        }

    }
}
