package other.easy;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Other1331 {
    public static void main(String[] args) {
//        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] arr = {40,10,20,30};
        int[] strings = Solution.arrayRankTransform(arr);
        System.out.println();
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }


    static class Solution {
        public static int[] arrayRankTransform(int[] arr) {
            int[] result = new int[arr.length];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2.intValue() - o1.intValue());
//            Input: arr = [37,12,28,9,100,56,80,5,12]
//            Output: [5,3,4,2,8,6,7,1,3]
            for (Integer str : set) {
                pq.add(str);
            }
            int rank = set.size();
            int origin = -1;
            while (!pq.isEmpty()){
                int poll = pq.poll();
                System.out.println(poll);
                for (int i = 0; i < arr.length; i++) {
                    if(poll == arr[i]){
                        result[i] = rank;
                    }
                }
                if(origin != poll){
                    rank --;
                    origin = poll;
                }
            }
            return result;
        }
    }
}
