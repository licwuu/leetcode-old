package editor.cn;

public class MergeKSortedLists23 {
    public static void main(String[] args) {
        Solution solution = new MergeKSortedLists23().new Solution();
    }
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) return null;
            return merge(lists, 0, lists.length - 1);
        }

        public ListNode merge(ListNode[] list, int s, int t) {
            if (s == t) return list[s];
            int m = (s + t) / 2;
            ListNode listNode1 = merge(list, s, m);
            ListNode listNode2 = merge(list, m + 1, t);
            ListNode res = new ListNode();
            ListNode f = res;
            while (listNode1 != null && listNode2 != null) {
                if (listNode1.val < listNode2.val) {
                    f.next = listNode1;
                    listNode1 = listNode1.next;
                } else {
                    f.next = listNode2;
                    listNode2 = listNode2.next;
                }
                f = f.next;
            }
            while (listNode1 != null) {
                f.next = listNode1;
                listNode1 = listNode1.next;
                f = f.next;
            }
            while (listNode2 != null) {
                f.next = listNode2;
                listNode2 = listNode2.next;
                f = f.next;
            }
            return res.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}