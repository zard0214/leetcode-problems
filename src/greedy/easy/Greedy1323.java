package greedy.easy;


/**
 * @author zard
 * @date Created in 23/04/2022 01:30
 */
public class Greedy1323 {
    public static void main(String[] args) {
        int num = 9999;
        int i = Solution.maximum69Number(num);
        System.out.println(i);
    }

    static class Solution {
        public static int maximum69Number(int num) {
            int result = num;
            char[] num69 = (num + "").toCharArray();
            for (int i = 0; i < num69.length; i++) {
                if(num69[i] == '9'){
                    num69[i] = '6';
                    int now = calculateNum(num69);
                    if(now > result)
                        result = now;
                    num69[i] = '9';
                }else {
                    num69[i] = '9';
                    int now = calculateNum(num69);
                    if(now > result)
                        result = now;
                    num69[i] = '6';
                }
            }
            return result;
        }

        private static int calculateNum(char[] num69) {
            String result = new String();
            for (int i = 0; i < num69.length; i++) {
                result +=  num69[i];
            }
            return Integer.parseInt(result);
        }
    }
}
