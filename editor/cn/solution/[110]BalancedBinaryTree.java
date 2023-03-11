package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

class BalancedBinaryTree{
    public static void main(String[] args) {
        Solution solution = new BalancedBinaryTree().new Solution();
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
    boolean res = true;
    int helper(TreeNode node){
        if(node == null) return 0;
        int leftH = helper(node.left);
        int rightH = helper(node.right);
        if(Math.abs(leftH - rightH) > 1){
            res = false;
        }
        return Math.max(leftH, rightH) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}