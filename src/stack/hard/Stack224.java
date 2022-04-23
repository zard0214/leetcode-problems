package stack.hard;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zard
 * @date Created in 22/04/2022 09:28
 */
public class Stack224 {

    public static void main(String[] args) {
        String s = "-2-1 + 2";
//        s = "(12 + 3)";
//        s = "2-1 + 2";
//        s = "(11+(4+5+2)-3)+(6+8)";
//        s = "(11+11-3)+(14)";
//        s = "(19)+(14)";
        int result = Stack224.Solution.calculate(s);
        System.out.println(result);

    }

    static class Solution {
        public static int calculate(String s) {
            String calculate = s.replace(" ","");
            char[] charsArray = calculate.toCharArray();
            int count = 0;
            //if first character == '-', start at index 1
            //else start at index 0;
            int i = 0;
            boolean flag = false;
            if(charsArray[0] == '-' || charsArray[0] == '+'){
                i = 1;
                if(charsArray[0] == '-')
                    flag = true;
            }
            //save bracket
            Queue<Character> bracketQueue = new LinkedList<>();
            Queue<Character> opeatorQueue = new LinkedList<>();
            Queue<Integer> numQueue = new LinkedList<>();
            for (; i < charsArray.length; i++) {
                if(charsArray[i] == '('){
                    bracketQueue.add(')');
                }
                if(charsArray[i] == ')'){
                    while (bracketQueue.size() > 0){
                        bracketQueue.poll();
                        int cal1;
                        while (numQueue.size() > 1){
                            cal1 = numQueue.poll();
                            while (opeatorQueue.size() > 0){
                                Character operator = opeatorQueue.poll();
                                if(operator == '+')
                                    cal1 += numQueue.poll();
                                else if(operator == '-')
                                    cal1 -= numQueue.poll();
                                numQueue.add(cal1);
                            }
                        }
                    }
                }
                if(charsArray[i] != '(' && charsArray[i] != ')' ){
                    if(charsArray[i] == '+' || charsArray[i] == '-' ){
                        //operator
                        opeatorQueue.add(charsArray[i]);
                    }else{
                        //digit
                        if(i + 1 < charsArray.length){
                            int sum = Integer.parseInt(charsArray[i] + "");
                            while (charsArray[i + 1] != '(' && charsArray[i + 1] != ')'
                                && charsArray[i + 1] != '+' && charsArray[i + 1] != '-' ){
                                sum *= 10;
                                sum += Integer.parseInt(charsArray[i + 1] + "");
                                i++;
                            }
                            numQueue.add(sum);
                        }else{
                            numQueue.add(Integer.parseInt(charsArray[i] + ""));
                        }

                    }
                }
            }
            int cal1;
            while (numQueue.size() > 1){
                cal1 = numQueue.poll();
                while (opeatorQueue.size() > 0){
                    Character operator = opeatorQueue.poll();
                    if(operator == '+')
                        cal1 += numQueue.poll();
                    else if(operator == '-')
                        cal1 -= numQueue.poll();
                    numQueue.add(cal1);
                }
            }
            count = numQueue.poll();
            if(flag){
                count *= -1;
            }
            return count;
        }
    }
}
