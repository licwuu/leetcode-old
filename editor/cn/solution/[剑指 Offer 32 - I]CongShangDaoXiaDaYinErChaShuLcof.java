package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.*;

class CongShangDaoXiaDaYinErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuLcof().new Solution();
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

    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ansList = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode tmp = q.remove();
            ansList.add(tmp.val);
            if(tmp.left != null) q.add(tmp.left);
            if(tmp.right != null) q.add(tmp.right);
        }
        int[] ans = new int[ansList.size()] ;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}