package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class FanZhuanLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new FanZhuanLianBiaoLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode front = null, back = head.next;
        while (back != null){
            head.next = front;
            front = head;
            head = back;
            back = back.next;
        }
        head.next = front;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}