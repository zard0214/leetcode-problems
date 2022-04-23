package stack.hard;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zard
 * @date Created in 22/04/2022 09:28
 */
public class Stack224222 {

    public static void main(String[] args) {
        String s = "-2-1 + 2";

        int result = Stack224222.Solution.calculate(s);
        System.out.println(result);

    }

    static class Solution {
        public static int calculate(String s) {
            String calculate = s.replace(" ","");
            char[] charsArray = calculate.toCharArray();
            int count = 0;
            //save bracket
            Queue<Character> bracketQueue = new LinkedList<>();
            Queue<Character> opeatorQueue = new LinkedList<>();
            Queue<Integer> numQueue = new LinkedList<>();
            for (int i = 0; i < charsArray.length; i++) {
                if(charsArray[i] == '(')
                    i = i;
                else if(charsArray[i] == ')')
                    i = i;
                else if(charsArray[i] == '+')
                    i = i;
                else if(charsArray[i] == '-'){
                    if(i - 1 > 0 && charsArray[i - 1] == '(' || charsArray[i - 1] == ')'){
                        if(i + 1 < charsArray.length - 1 &&
                                charsArray[i + 1] == '(' && charsArray[i - 1] == ')'){
                            int sum = 0;
                            sum += Integer.parseInt(charsArray[i] + "");
                            while (i + 1 < charsArray.length - 1 &&
                                    charsArray[i + 1] == '(' && charsArray[i - 1] == ')'){
                                sum *= 10;
                                sum += Integer.parseInt(charsArray[i + 1] + "");
                                i ++;
                            }
                            numQueue.add(sum);
                        }else{

                        }
                    }else{

                    }
                }
                else
                    i = i;
            }
            return count;
        }
    }
}
