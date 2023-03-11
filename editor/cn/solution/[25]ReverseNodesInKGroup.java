package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class ReverseNodesInKGroup{
    public static void main(String[] args) {
        Solution solution = new ReverseNodesInKGroup().new Solution();
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
        public ListNode reverseList(ListNode head, ListNode tail) {
            ListNode stop = tail.next, front = stop, back = head.next;
            while (back != stop){
                head.next = front;
                front = head;
                head = back;
                back = back.next;
            }
            head.next = front;
            return head;
        }
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode ansHead = new ListNode(0), front = head, tail = head, tmp = ansHead;
            ansHead.next = head;
            int flag = 0;
            while (true){
                for (int i = 1; i < k; i++) {
                    if(tail == null) break;
                    tail = tail.next;
                }
                if(tail == null){
                    break;
                }
                if(flag == 0) {
                    flag = 1;
                    ansHead.next = tail;
                }
                tmp.next = reverseList(front, tail);
                tmp = front;
                front = tail = front.next;
            }

            return ansHead.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}