package string.easy;

/**
 * @author zard
 * @date Created in 18/04/2022 11:38
 */
public class String1812 {
    public static void main(String[] args) {
        String coordinates = "a2";
        boolean b = String1812.Solution.squareIsWhite(coordinates);
        System.out.println(b);
    }

    static class Solution {
        public static boolean squareIsWhite(String coordinates) {
            char[] coordinate = coordinates.toCharArray();
            int[] coor = new int[2];
            coor[1] = Integer.parseInt(coordinate[1] + "");
            coor[0] = coordinate[0] - 'a' + 1 ;
            coor[0] = coor[0] % 2;
            coor[1] = coor[1] % 2;
            if(coor[0] == 0 && coor[1] == 0)
                return false;
            if(coor[0] == 0 && coor[1] == 1)
                return true;
            if(coor[0] == 1 && coor[1] == 1)
                return false;
            if(coor[0] == 1 && coor[1] == 0)
                return true;
            return false;
        }
    }
}
