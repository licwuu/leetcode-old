package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BinaryTreePreorderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreePreorderTraversal().new Solution();
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
        List<Integer> preOrder = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            helper(root);
            return preOrder;
        }
        private void helper(TreeNode node){
            if(node == null) return;
            preOrder.add(node.val);
            helper(node.left) ;
            helper(node.right);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}