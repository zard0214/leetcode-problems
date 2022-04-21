package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 20/04/2022 11:50
 */
public class Arrays119 {
    public static void main(String[] args) {
        int numRows = 1;
        List<Integer> generate = Arrays119.Solution.getRow(numRows);
        for (int i = 0; i < generate.size(); i++) {
            System.out.print(generate.get(i) + " ");
        }
    }

    static class Solution {
//        public static List<List<Integer>> generate(int numRows) {
        public static List<Integer> getRow(int rowIndex) {
            int numRows = 35;
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    list.add(0);
                }
                result.add(list);
            }
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < i; j++) {
                    List<Integer> integers = result.get(i);
                    if(j == 0 || j == i - 1){
                        integers.set(j, 1);
                    }
                }
            }
            for (int i = 0; i < numRows; i++) {
                List<Integer> integers = result.get(i);
                for (int j = 0; j < integers.size(); j++) {
                    if(0 == integers.get(j)){
                        if(i != 0){
                            List<Integer> integers2 = result.get(i - 1);
                            integers.set(j, integers2.get(j - 1) + integers2.get(j));
                        }
                    }
                    result.set(i, integers);
                }
            }
            result.remove(0);
            return result.get(rowIndex);
        }
    }
}
