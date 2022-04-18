package string.medium;


import java.util.HashSet;
import java.util.Set;

/**
 * String DFS
 * @author zard
 * @date Created in 18/04/2022 12:07
 */
public class String1079 {
    public static void main(String[] args) {
        String tiles = "AAABBC";
        int i = String1079.Solution.numTilePossibilities(tiles);
        System.out.println(i);
    }

    static class Solution {
        public static int numTilePossibilities(String tiles) {
            Set result = new HashSet();
            char[] tile = tiles.toCharArray();
            int length = tile.length;
            for (int i = 0; i < length; i++) {
                String target = tile[i] + "";
                System.out.println(target);
                result.add(target);
                String temp = target;
//                target = "";
                for(int j = 0 ; j < length; j++){
                    if(i != j){
                        target += tile[j];
                        System.out.println(target);
                        result.add(target);
                    }
                }
                for(int j = 0 ; j < length; j++){
                    if(i != j){
                        target += tile[j];
                        System.out.println(target);
                        result.add(target);
                        target = "";
                    }
                }
            }
            return result.size();
        }
    }
}
