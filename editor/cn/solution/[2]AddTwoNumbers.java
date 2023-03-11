package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode sum = new ListNode(0), tmp = sum;
            int nextBit = 0;
            while (l1 != null && l2 != null){
                int s = l1.val + l2.val + nextBit;
                tmp.next = new ListNode(s % 10);
                nextBit = s / 10;
                tmp = tmp.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            while (l1 != null){
                int s = l1.val + nextBit;
                tmp.next = new ListNode(s % 10);
                nextBit = s / 10;
                tmp = tmp.next;
                l1 = l1.next;

            }
            while (l2 != null) {
                int s = l2.val + nextBit;
                tmp.next = new ListNode(s % 10);
                nextBit = s / 10;
                tmp = tmp.next;
                l2 = l2.next;
            }
            if(nextBit == 1) tmp.next = new ListNode(nextBit);
            return sum.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}