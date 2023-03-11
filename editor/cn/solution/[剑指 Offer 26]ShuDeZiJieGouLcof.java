package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

class ShuDeZiJieGouLcof{
    public static void main(String[] args) {
        Solution solution = new ShuDeZiJieGouLcof().new Solution();
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
    public boolean isSameConstructor(TreeNode A, TreeNode B){
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return isSameConstructor(A.right, B.right) && isSameConstructor(A.left, B.left);
    }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null) return false;
        if(isSameConstructor(A , B))
            return true;
        if(A != null){
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }
        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}