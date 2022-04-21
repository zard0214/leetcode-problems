package other;

/**
 * @author zard
 * @date Created in 21/04/2022 05:11
 */
public class Other338 {
    public static void main(String[] args) {
        int n = 5;
        int[] ints = Solution.countBits(n);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    static class Solution {
        public static int[] countBits(int n) {
            int[] bits = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                bits[i] = getBitsCount(i);
            }
            return bits;
        }

        private static int getBitsCount(int i) {
            int sum = 0;
            while (i > 0){
                if(i % 2 == 1){
                    sum ++;
                }
                i /= 2;
            }
            return sum;
        }
    }

//    It is very easy to come up with a solution with a runtime
//    of O(n log n). Can you do it in linear time O(n)
//    and possibly in a single pass?
//    很容易想出一个运行时为O（n log n）的解决方案。你能在线性时间O（n）内做到这一点，
//    并且可能在一次传递中做到这一点吗？
//    你能在不使用任何内置函数（即，像C++中的__builtin_popcount）的情况下做到这一点吗？
//    很容易提出具有运行时的解决方案
//    的 O（n log n）。你能在线性时间O（n）中做到这一点吗？
//    而且可能在一次通过？
//
//    Can you do it without using any built-in function
//            (i.e., like __builtin_popcount in C++)?
//    您可以在不使用任何内置功能的情况下做到这一点吗？
//            （即，像C++中的__builtin_popcount）？
}
