package other.easy;


import java.util.*;

public class Other1394 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,3,3};
        System.out.println(Solution.findLucky(nums));
    }


    static class Solution {
        public static int findLucky(int[] arr) {
            int result = -1;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if(map.get(arr[i]) == null)
                    map.put(arr[i], 1);
                else{
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getKey() == entry.getValue()){
                    if(entry.getKey() >= result){
                        result = entry.getKey();
                    }
                }

            }
            return result;
        }
    }
}
