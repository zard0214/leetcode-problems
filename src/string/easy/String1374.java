package string.easy;

/**
 * @author zard
 * @date Created in 15/04/2022 07:47
 */
public class String1374 {

    public static void main(String[] args) {
        int n = 7;

        String i = String1374.Solution.generateTheString(n);
        System.out.println(i);
    }

    static class Solution {
        public static String generateTheString(int n) {
            String generate = "";
            Character[] characters = new Character[]{'q','w'};
            if(n % 2 == 0){
                generate += characters[0];
                for (int i = 0; i < n - 1; i++) {
                    generate += characters[1];
                }
            }else{
                for (int i = 0; i < n ; i++) {
                    generate += characters[1];
                }
            }
            return generate;
        }
    }
}
