package string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zard
 * @date Created in 27/09/2021 10:22
 */
public class String1324 {

    public static void main(String[] args) {

        String s = "HOW ARE YOU";
        s = "TO BE OR NOT TO BE";
//        s = "CONTEST IS COMING";
        //"HOW ARE YOU"
        //H O W
        //A R E
        //Y O U
        //["HAY","ORO","WEU"]

        //"TO BE OR NOT TO BE"
        //T O
        //B E
        //O R
        //N O T
        //T O
        //B E
        //["TBONTB","OEROOE","   T"]
        List<String> list = Solution.printVertically(s);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static class Solution {
        public static List<String> printVertically(String s) {
            String[] s1 = s.split(" ");
            int max = -1;
            for (int i = 0; i < s1.length; i++) {
                if(s1[i].length() > max)
                    max = s1[i].length();
            }
            Character[][] characters = new Character[max][s1.length];
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < s1.length; j++) {
                    try {
                        characters[i][j] = s1[j].charAt(i);
                    }catch (StringIndexOutOfBoundsException e){
                        characters[i][j] = ' ';
                    }catch (ArrayIndexOutOfBoundsException e){
                    }
                }
            }
            System.out.println("max :" + max);
            List<String> result = new ArrayList<>();
            for (int i = 0; i < characters.length; i++) {
                String results = "";
                for (int j = 0; j < characters[i].length; j++) {
                    results+=characters[i][j];
                    System.out.print(characters[i][j] + " ");
                }
                results = results.replaceAll("\\s+$", "");
                result.add(results);
                System.out.println();
            }
            return result;
        }
    }
}
