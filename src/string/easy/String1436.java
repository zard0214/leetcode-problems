package string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 18/04/2022 13:17
 */
public class String1436 {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List path1 = new ArrayList();
        path1.add("B");
        path1.add("C");
        List path2 = new ArrayList();
        path2.add("D");
        path2.add("B");
        List path3 = new ArrayList();
        path3.add("C");
        path3.add("A");
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);
        String s = Solution.destCity(paths);
        System.out.println(s);
    }

    static class Solution {
        public static String destCity(List<List<String>> paths) {
            String result = "";

            return result;
        }
    }
}
