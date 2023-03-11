package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BinaryTreePostorderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
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
        List<Integer> postOrder = new ArrayList<>();
        public List<Integer> postorderTraversal(TreeNode root) {
            helper(root);
            return postOrder;
        }
        private void helper(TreeNode node){
            if(node == null) return;
            helper(node.left) ;
            helper(node.right);
            postOrder.add(node.val);
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}