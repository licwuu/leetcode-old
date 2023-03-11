package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedList().new Solution();
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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode tmp = head;
            while (tmp != null){
                while (tmp.next != null && tmp.val == tmp.next.val) tmp.next = tmp.next.next;
                tmp = tmp.next;
            }
            return head;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}