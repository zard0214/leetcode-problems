package dp.easy;

/**
 * @author zard
 * @date Created in 30/09/2021 10:46
 */
public class DP509 {
    public static void main(String[] args) {
        System.out.println(Solution.fib(1000000));
    }
    static class Solution {

        public static int fib2(int n) {
            int[] memo = new int[n + 1];
            memo[0] = 0;
            return fibonacciHelper(memo, n);
        }

        private static int fibonacciHelper(int[] memo, int n) {
            if(n == 0 || n == 1) {
                return n;
            }
            if(memo[n] != 0){
                return memo[n];
            }
            memo[n] = fibonacciHelper(memo, n - 1) + fibonacciHelper(memo, n - 2);
            return memo[n];
        }

        public static int fib(int n) {
            if(n == 0 || n == 1) return n;
            int prev = 0, cur = 1;
            for (int i = 2; i <= n; i++) {
                int sum = prev + cur;
                prev = cur;
                cur = sum;
            }
            return cur;
        }
    }
}
