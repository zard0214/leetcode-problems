package other;

/**
 * @author zard
 * @date Created in 21/04/2022 05:25
 */
public class Other415 {
    public static void main(String[] args) {
        String num1 = "0";
        String num2 = "0";
        String s = Solution.addStrings(num1, num2);
        System.out.println(s);
//        System.out.println(123456789 + 123456789);
    }

    static class Solution {

        public static String addStrings(String num1, String num2) {
            String result = "";
            int length1 = num1.length();
            int length2 = num2.length();
            int[] res = null;
            int index = 0;
            if (length1 == length2) {
                res = new int[length1 + 1];
                for (int i = length1 - 1; i >= 0; i--) {
                    int count = Integer.parseInt(num1.charAt(i) + "") +
                            Integer.parseInt(num2.charAt(i) + "") + res[index++];
                    if (count >= 10) {
                        count = count - 10;
                        res[index] += 1;
                    }
                    res[index - 1] = count;
                }
            } else if (length1 > length2) {
                //91
                //1
                res = new int[length1 + 1];
                int index1 = length1 - 1;
                int index2 = length2 - 1;
                while (index1 >= 0) {
                    if (index2 >= 0) {
                        int count = Integer.parseInt(num1.charAt(index1) + "") +
                                Integer.parseInt(num2.charAt(index2) + "") + res[index++];
                        if (count >= 10) {
                            count = count - 10;
                            res[index] += 1;
                        }
                        res[index - 1] = count;
                    } else {
                        int count = Integer.parseInt(num1.charAt(index1) + "") + res[index++];
                        if (count >= 10) {
                            count = count - 10;
                            res[index] += 1;
                        }
                        res[index - 1] = count;
                    }
                    index1--;
                    index2--;
                }
            } else if (length2 > length1) {
                res = new int[length2 + 1];
                int index1 = length1 - 1;
                int index2 = length2 - 1;
                while (index2 >= 0) {
                    if (index1 >= 0) {
                        int count = Integer.parseInt(num2.charAt(index2) + "") +
                                Integer.parseInt(num1.charAt(index1) + "") + res[index++];
                        if (count >= 10) {
                            count = count - 10;
                            res[index] += 1;
                        }
                        res[index - 1] = count;
                    } else {
                        int count = Integer.parseInt(num2.charAt(index2) + "") + res[index++];
                        if (count >= 10) {
                            count = count - 10;
                            res[index] += 1;
                        }
                        res[index - 1] = count;
                    }
                    index1--;
                    index2--;
                }
            }
            for (int r = res.length - 1; r >= 0; r--) result += res[r];
            while (result.length() > 1 && result.startsWith("0"))
                result = result.substring(1);
            return result;
        }
    }
}



























//            for (int i = res.length - 1; i >= 0; i--) {
//                int count = 0;
//                int j = 0;
//                if(length1 > length2){
//                    if(i > length1 - 1){
//                        count = Integer.parseInt(charNum2[j] + "") + res[i];
//                    } else if(i > length2 - 1){
//                        count = Integer.parseInt(charNum1[i] + "") + res[i];
//                    }else{
//                        count = Integer.parseInt(charNum1[i] + "")
//                                + Integer.parseInt(charNum2[j] + "") + res[i];
//                    }
//                }else{
//                    if(i > length1 - 1){
//                        count = Integer.parseInt(charNum2[i] + "") + res[i];
//                    } else if(i > length2 - 1){
//                        count = Integer.parseInt(charNum1[j] + "") + res[i];
//                    }else{
//                        count = Integer.parseInt(charNum1[j] + "")
//                                + Integer.parseInt(charNum2[i] + "") + res[i];
//                    }
//                }
//                j++;
//                if(count < 9){
//                    res[i] = count;
//                }else{
//                    if(count == 10){
//                        res[i] = 0;
//                        res[i + 1] = res[i + 1] + 1;
//                    }else{
//                        res[i] = count - 10;
//                        res[i + 1] = res[i + 1] + 1;
//                    }
//                }
//
//            }
//            for (int i = res.length - 1; i > -1; i--) {
//                result += res[i];
//            }