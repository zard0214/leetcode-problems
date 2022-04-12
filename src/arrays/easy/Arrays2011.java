package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 06:21
 */
public class Arrays2011 {

    public static void main(String[] args) {
        String[] operations = new String[]{"--X","X++","X++"};
        int res = Arrays2011.Solution.finalValueAfterOperations(operations);
        System.out.println(res);

    }

    static class Solution {
        public static int finalValueAfterOperations(String[] operations) {
            int res = 0;
            for(int i = 0 ; i < operations.length ; i ++) {
                if(operations[i].contains("-")){
                    res--;
                }else{
                    res++;
                }
                continue;
            }
            return res;
        }
    }
}
