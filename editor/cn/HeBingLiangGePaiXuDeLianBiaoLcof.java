package editor.cn;

import editor.cn.helpClass.ListNode;

public class HeBingLiangGePaiXuDeLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head = new ListNode(0), tmp = head;
        while(l1 != null && l2 != null){
            if( l1.val <= l2.val){
                tmp.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                tmp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        tmp.next = (l1 == null ? l2 : l1);
        return head.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}