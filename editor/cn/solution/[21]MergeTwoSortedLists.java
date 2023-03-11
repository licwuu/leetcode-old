package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class MergeTwoSortedLists{
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode head = new ListNode(0), tmp = head;
            while (list1 != null || list2 != null){
                if(list1 != null && list2 != null){
                    if(list1.val < list2.val){
                        tmp.next = list1;
                        list1 = list1.next;
                    }else {
                        tmp.next = list2;
                        list2 = list2.next;
                    }
                    tmp = tmp.next;
                }else if(list1 != null){
                    tmp.next = list1;
                    break;
                }else {
                    tmp.next = list2;
                    break;
                }
            }
            return head.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}