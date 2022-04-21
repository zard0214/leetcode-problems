package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 20/04/2022 12:01
 */
public class Arrays120 {
    public static void main(String[] args) {
//        int[][] triangle = {{2}, {3,4}, {6,5,7}, {4,1,8,3}};
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        lists.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        lists.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(-1);
        list3.add(-3);
        lists.add(list3);

        int sum = Arrays120.Solution.minimumTotal(lists);
        System.out.print(sum);
    }

    static class Solution {
        public static int minimumTotal(List<List<Integer>> triangle) {
            int sum = 0;
            for (int i = 0; i < triangle.size(); i++) {
                if(0 == i){
                    sum += triangle.get(i).get(0);
                }else{
                    List<Integer> list = triangle.get(i);
                    int min = Integer.MAX_VALUE;
                    for (int j = 0; j < list.size(); j++) {
                        if(min > list.get(j)){
                            min = list.get(j);
                        }
                    }
                    sum += min;
                }
            }
            return sum;
        }
    }
}
