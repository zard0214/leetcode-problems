package dp.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 30/09/2021 17:01
 */
public class DP118 {
    public static void main(String[] args) {
        System.out.println(Solution.generate(1));
    }

    static class Solution {
        public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();
            List<Integer> line = new ArrayList<>();
            line.add(1);
            triangle.add(line);
            line = new ArrayList<>();
//            if()
            line.add(1);
            line.add(1);
            triangle.add(line);
            return triangle;
        }
    }
}
