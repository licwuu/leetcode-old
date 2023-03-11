package editor.cn;

import editor.cn.helpClass.ListNode;

public class LinkedListCycleIi142 {
    public static void main(String[] args) {
        Solution solution = new LinkedListCycleIi142().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) return null;
            ListNode slow = head, fast = head.next;

            // 快慢指针找到循环节点及之后的节点数step
            int step = 1;
            while (slow != fast) {
                slow = slow.next;
                if (fast == null || fast.next == null) return null;
                fast = fast.next.next;
                step++;
            }
            // 从头开始，fast先走step步
            fast = slow = head;
            for (int i = 0; i < step; i++) {
                fast = fast.next;
            }
            // 当两个指针相同时就是环产生的节点
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}