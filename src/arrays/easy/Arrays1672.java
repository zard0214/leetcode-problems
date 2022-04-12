package arrays.easy;

/**
 * @author zard
 * @date Created in 24/09/2021 07:29
 */
public class Arrays1672 {

    public static void main(String[] args) {
        int[][] accounts = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        int res = Arrays1672.Solution.maximumWealth(accounts);
        System.out.println(res);

    }

    static class Solution {
        public static int maximumWealth(int[][] accounts) {
            int res = 0;
            for(int i = 0 ; i < accounts.length ; i ++){
                int wealth = 0;
                for(int j = 0 ; j < accounts[i].length ; j++){
                    wealth += accounts[i][j];
                }
                if(wealth >= res){
                    res = wealth;
                }
            }
            return res;
        }
    }
}
