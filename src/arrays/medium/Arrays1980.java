package arrays.medium;

/**
 * @author zard
 * @date Created in 21/04/2022 08:46
 */
public class Arrays1980 {
    public static void main(String[] args) {
        String[] nums = new String[]{"0"};
        String differentBinaryString = Solution.findDifferentBinaryString(nums);
        System.out.println(differentBinaryString);
    }

    static class Solution {
        public static String findDifferentBinaryString(String[] nums) {
            String result = initResult(nums);
            int numberOf1 = 0;
            boolean apear = checkIfExist(result.toCharArray(), nums);
            if(!apear)
                return result;
            else{
                //"000","011","001"
                while (numberOf1 < nums.length + 1){
                    numberOf1++;
                    for (int i = 0; i < numberOf1; i++) {
                        char[] chars = result.toCharArray();
                        for (int j = 0; j < chars.length; j++) {
                            chars[j] = '1';
                            if(!checkIfExist(chars, nums)){
                                result = "";
                                for (int k = 0; k < chars.length; k++) {
                                    result += chars[k];
                                }
                                return result;
                            }
                        }
                    }
                    numberOf1++;
                }
                if(!apear)
                    return result;
                else
                    return "-1";
            }
        }

        private static String initResult(String[] nums) {
            String result = "";
            for (int i = 0; i < nums.length; i++) {
                result+="0";
            }
            return result;
        }

        private static boolean checkIfExist(char[] chars, String[] nums) {
            String result = "";
            for (int k = 0; k < chars.length; k++) {
                result += chars[k];
            }
            boolean apear = false;
            for (int i = 0; i < nums.length; i++) {
                if(result.compareTo(nums[i]) == 0)
                    apear = true;
            }
            System.out.println("checkIfExist: " + result);
            if(!apear)
                return false;
            return true;
        }
    }
}
