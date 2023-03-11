package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof{
    public static void main(String[] args) {
        Solution solution = new LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode A = headA, B = headB;
            while (A != B){
                A = (A != null ? A.next : headB);
                B = (B != null ? B.next : headA);
            }
            return A;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}