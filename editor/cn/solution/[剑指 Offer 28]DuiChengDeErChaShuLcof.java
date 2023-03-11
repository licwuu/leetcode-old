package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

class DuiChengDeErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new DuiChengDeErChaShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricHelper(root.left, root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}