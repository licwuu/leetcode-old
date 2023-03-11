package editor.cn;

import editor.cn.helpClass.TreeNode;

public class LowestCommonAncestorOfABinaryTree236 {
    public static void main(String[] args) {
        Solution solution = new LowestCommonAncestorOfABinaryTree236().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        TreeNode ans = null;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            findPQ(root, p, q);
            return ans;
        }

        int findPQ(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return 0;

            int res = 0;
            if (root == p) res += 1;
            if (root == q) res += 2;

            res += findPQ(root.left, p, q);
            if (res == 3) {
                ans = ans == null?root:ans;
                return res;
            }
            res += findPQ(root.right, p, q);
            if (res == 3) {
                ans = ans == null?root:ans;
                return res;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}