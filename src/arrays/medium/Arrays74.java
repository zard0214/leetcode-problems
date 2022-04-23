package arrays.medium;

/**
 * @author zard
 * @date Created in 21/04/2022 08:13
 */
public class Arrays74 {

    public static void main(String[] args) {
        int target = 76;
        int[][] matrix = new int[][]{{-8,-8,-7,-7,-6,-5,-3,-2}, {0,0,1,3,4,6,8,8}, {11,12,14,16,18,18,19,19},
                {22,23,25,27,28,30,30,31}, {34,35,37,39,40,42,43,45}, {48,50,51,51,53,54,55,57},
                {58,60,62,62,62,63,63,65}, {68,69,71,72,72,72,74,76}};
        boolean b = Solution.searchMatrix(matrix, target);
        System.out.println(b);
    }

    static class Solution {
        static int searchLine(int arr[], int l, int r, int x) {
            if (r >= l) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == x)
                    return mid;
                else{
                    if(arr[mid] > x && arr[mid + 1] < x)
                        return mid;
                    if(arr[mid] < x && arr[mid + 1] > x)
                        return mid;
                    else
                        if(arr[mid] > x)
                            return searchLine(arr, l, mid - 1, x);
                        if(arr[mid] < x)
                            return mid + 1;
                }
            }
            return -1;
        }

        static int binarySearch(int arr[], int l, int r, int x) {
            if (r >= l) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1, x);
                return binarySearch(arr, mid + 1, r, x);
            }
            return -1;
        }

        public static boolean searchMatrix(int[][] matrix, int target) {
            if(target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1])
                return false;
            int[] array = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                array[i] = matrix[i][0];
            }
            int line;
            if(matrix.length > 1)
                line = searchLine(array, 0, array.length - 1, target);
            else
                line = 0;
            array = new int[matrix[0].length];
            for (int i = 0; i < matrix[0].length; i++) {
                array[i] = matrix[line][i];
            }
            int r = binarySearch(array, 0, array.length - 1, target);
            if(r != -1)
                return true;
            return false;
        }
    }
}
