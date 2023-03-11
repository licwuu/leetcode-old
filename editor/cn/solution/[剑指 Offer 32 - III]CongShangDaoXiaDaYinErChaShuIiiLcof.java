package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CongShangDaoXiaDaYinErChaShuIiiLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiiLcof().new Solution();
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int level = 1;
        if(root == null)
            return ans;
        List<Integer> levelList = new ArrayList<>();
        TreeNode tmp;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);//每层结束加入null作为标识
        while(!q.isEmpty()){
            tmp = q.remove();
            if(tmp != null){
                levelList.add(tmp.val);
                if(tmp.left != null){
                    q.add(tmp.left);
                }
                if(tmp.right != null){
                    q.add(tmp.right);
                }
            }else{
                if(!q.isEmpty()){
                    q.add(null);//每层结束加入null作为标识
                }
                if((level & 1) == 0){
                    int n = levelList.size();
                    for (int i = 0; i < n/2; i++) {
                        int tmpNum = levelList.get(i);
                        levelList.set(i, levelList.get(n - i - 1));
                        levelList.set(n - i - 1, tmpNum);
                    }
                }
                level ++;
                ans.add(levelList);
                levelList = new ArrayList<>();
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}