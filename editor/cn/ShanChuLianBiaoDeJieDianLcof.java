package editor.cn;

import editor.cn.helpClass.ListNode;

public class ShanChuLianBiaoDeJieDianLcof {
    public static void main(String[] args) {
        Solution solution = new ShanChuLianBiaoDeJieDianLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            if (head == null) return null;
            if (head.val == val) return head.next;
            ListNode tmp = head;
            while (tmp.next != null) {
                if (tmp.next.val == val) {
                    tmp.next = tmp.next.next;
                    break;
                }
                tmp = tmp.next;
            }
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}