package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

class ErChaShuDeShenDuLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaShuDeShenDuLcof().new Solution();
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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}