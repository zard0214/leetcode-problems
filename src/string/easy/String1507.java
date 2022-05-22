package string.easy;

/**
 * @author zard
 * @date Created in 06/10/2021 19:18
 */
public class String1507 {

    public static void main(String[] args) {
        String date = "6th Oct 2052";
        String string = Solution.reformatDate(date);
        System.out.println(string);
    }

    static class Solution {
        //input = "20th Oct 2052";
        //output = "2052-10-20"
        public static String reformatDate(String date) {
            String result = "";
            String[] dates = date.split(" ");
            result += dates[2];
            result += "-";
            switch (dates[1]){
                case "Jan":
                    result += "01-";
                    break;
                case "Feb":
                    result += "02-";
                    break;
                case "Mar":
                    result += "03-";
                    break;
                case "Apr":
                    result += "04-";
                    break;
                case "May":
                    result += "05-";
                    break;
                case "Jun":
                    result += "06-";
                    break;
                case "Jul":
                    result += "07-";
                    break;
                case "Aug":
                    result += "08-";
                    break;
                case "Sep":
                    result += "09-";
                    break;
                case "Oct":
                    result += "10-";
                    break;
                case "Nov":
                    result += "11-";
                    break;
                case "Dec":
                    result += "12-";
                    break;

            }
            String date1 = dates[0];
            String substring = date1.substring(0, date1.length() - 2);
            String substring1 = "";
            if(substring.length() == 1){
                substring1 += ('0' + substring);
            }else{
                substring1 += substring;
            }
            result += substring1;
            return result;
        }
    }
}
