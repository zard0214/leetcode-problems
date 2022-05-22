package stack.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zard
 * @date Created in 22/04/2022 09:28
 */
public class Stack946 {

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        boolean b = Solution.validateStackSequences(pushed, popped);
        System.out.println(b);
    }

    static class Solution {
        public static boolean validateStackSequences(int[] pushed, int[] popped) {
            Deque<Integer> stack = new ArrayDeque<>();
            int x = 0;
            int y = 0;
            while (x < pushed.length){
                stack.offerFirst(pushed[x]);
                while (y < popped.length && !stack.isEmpty() && popped[y] == stack.peekFirst()){
                    stack.pollFirst();
                    y++;
                }
                x++;
            }
            while(y < popped.length){
                if(stack.peekFirst() == popped[y]){
                    stack.pollFirst();
                    y++;
                } else {
                    break;
                }
            }
            return stack.isEmpty();
        }
    }
}
