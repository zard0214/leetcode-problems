package dfs;

import java.util.*;

/**
 *
 *
 * DFS demo
 * @author zard
 * @date Created in 26/04/2022 05:12
 */
public class a {

    public static void main(String[] args) {
        Character[] d = {'a', 'e', 'i', 'o', 'u'};
        int n = 2;
        boolean[] c = new boolean[5];
        Character[] b = new Character[5];
        Set<String> res = new HashSet<>();
        Set<String> dfs = Solution.dfs(d, c, 0, b, res, n);
        Iterator<String> iterator = dfs.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
//        System.out.println(dfs.size());

    }

    static class Solution {

        private static Set<String> dfs(Character[] p, boolean[] pb, int level, Character[] res, Set<String> ress, int n){
            if(level == p.length){
                String s = "";
                for (int i = 0; i < 5; i++) {
                    s += res[i];
                }
                if(!s.isEmpty())
                    ress.add(s);
                return ress;
            }
            for(int i = 0; i < 5; i++) {
                Character e = p[i];
                if(!pb[i]){
                    res[level] = e;
                    pb[i] = false;
                    dfs(p, pb, level + 1, res, ress, n);
                    res[level] = null;
                    pb[i] = false;
                }
            }
            return ress;
        }
    }
}
