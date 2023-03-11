package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class RemoveNthNodeFromEndOfList{
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode front = head, back = head;
            for (int i = 0; i < n; i++) {
                back = back.next;
                if(back == null) return head.next;
            }
            while (back.next != null){
                front = front.next;
                back = back.next;
            }
            front.next = front.next.next;
            return head;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}