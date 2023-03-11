package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

class PathSum{
    public static void main(String[] args) {
        Solution solution = new PathSum().new Solution();
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        return helper(root, targetSum, 0);
    }
    public boolean helper(TreeNode root, int targetSum, int sum){
        if(root == null) return false;
        sum += root.val;
        if(sum == targetSum && root.right == null && root.left == null)
            return true;

        return helper(root.left, targetSum, sum) ||
                helper(root.right, targetSum, sum);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}