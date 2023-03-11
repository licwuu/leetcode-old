package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeInorderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeInorderTraversal().new Solution();
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
        List<Integer> ans = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            helper(root);
            return ans;
        }
        public void helper(TreeNode treeNode){
            if(treeNode == null) return;
            helper(treeNode.left);
            ans.add(treeNode.val);
            helper(treeNode.right);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}