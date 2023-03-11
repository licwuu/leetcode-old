package editor.cn;

import editor.cn.helpClass.ListNode;

public class PartitionList86 {
    public static void main(String[] args) {
        Solution solution = new PartitionList86().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode lt = new ListNode(0), gt = new ListNode(0);
            ListNode lp = lt, gp = gt;
            while (head != null){
                if(head.val < x) {
                    lp.next = head;
                    lp = lp.next;
                }else {
                    gt.next = head;
                    gt = gt.next;
                }
                ListNode tmp = head.next;
                head.next = null;
                head = tmp;
            }
            lp.next = gp.next;

            return lt.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}