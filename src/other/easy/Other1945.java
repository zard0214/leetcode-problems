package other.easy;


public class Other1945 {
    public static void main(String[] args) {
//        System.out.println('i');
        System.out.println(Solution.getLucky("zbax", 2));
    }


    static class Solution {

        public static int getLucky(String s, int k) {
            int transform = 0;
            return getLucky2(s, k , transform);
        }

        public static int getLucky2(String s, int k, int transform) {
            char[] chars = s.toCharArray();
            String num = "";
            if(transform == 0){
                for (int i = 0; i < chars.length; i++) {
                    int cs = chars[i] - 'a' + 1;
                    num += String.valueOf(cs);
                }
            }

            if(transform == k)
                return Integer.parseInt(s);
            int count = 0;
            char[] chars1 = null;
            if(transform == 0)
                chars1 = num.toCharArray();
            if(transform != 0){
                chars1 = s.toCharArray();
            }
            for (int i = 0; i < chars1.length; i++) {
                count += Integer.parseInt(chars1[i] + "");
            }
            transform = transform + 1;
            return getLucky2(count + "" ,k, transform);
        }
    }
}
