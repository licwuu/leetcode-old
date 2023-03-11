package editor.cn;

import editor.cn.helpClass.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ZhongJianErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();
        solution.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
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
        Map<Integer,Integer> hash = new HashMap<>();//优化对中序遍历结点位置的查找
        public TreeNode buildTreeHelper(int[] preorder, int pl, int pr, int il, int ir){
            if(pl > pr) {
                return null;
            }
            TreeNode node = new TreeNode(preorder[pl]);
            int k = hash.get(preorder[pl]);
            node.left = buildTreeHelper(preorder, pl + 1, pl + k - il, il, k - 1);
            node.right = buildTreeHelper(preorder, pl + k - il + 1,pr,k + 1, ir);
            return node;
        }
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                hash.put(inorder[i], i);
            }
            return buildTreeHelper(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}