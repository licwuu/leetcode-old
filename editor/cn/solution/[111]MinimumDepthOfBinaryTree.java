package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

class MinimumDepthOfBinaryTree{
    public static void main(String[] args) {
        Solution solution = new MinimumDepthOfBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int minDepth(TreeNode root) {
            if(root == null) return 0;
            if(root.left != null && root.right != null)
                return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
            else if(root.left != null)
                return minDepth(root.left) + 1;
            else if(root.right != null)
                return minDepth(root.right) + 1;
            else return 1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}