//package heap.medium;
//
//
///**
// * @author zard
// * @date Created in 21/04/2022 11:32
// */
//public class Heap148 {
//
//    public static void main(String[] args) {
//        int[] nums = {5,2,3,1};
//        int[] i = Heap148.Solution.sortArray(nums);
//        System.out.println(i);
//    }
//
//    static class Solution {
//        public ListNode sortList(ListNode head) {
//            ListNode node = new ListNode();
//            for (int i = 0; i < head. - 1; i++)
//                for (int j = 0; j < n - i - 1; j++)
//                    if (arr[j] > arr[j + 1]) {
//                        // swap arr[j+1] and arr[j]
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//            return node;
//        }
//
//         public static class ListNode {
//             int val;
//             ListNode next;
//             ListNode() {}
//             ListNode(int val) { this.val = val; }
//             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//        }
//
//    }
//}
