package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;

class LianBiaoZhongDaoShuDiKgeJieDianLcof{
    public static void main(String[] args) {
        Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
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
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode ans = head, help = head;
        for (int i = 1; i < k; i++) {
            if(help.next != null)
                help = help.next;
            else return null;
        }
        while(help.next != null){
            help = help.next;
            ans = ans.next;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}