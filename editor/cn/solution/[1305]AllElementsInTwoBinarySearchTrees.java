package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.ListNode;
import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class AllElementsInTwoBinarySearchTrees{
    public static void main(String[] args) {
        Solution solution = new AllElementsInTwoBinarySearchTrees().new Solution();
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
        void inorder(Queue<Integer> list, TreeNode root){
            if(root == null) return;
            inorder(list, root.left);
            list.add(root.val);
            inorder(list, root.right);
        }
        List<Integer> merge(Queue<Integer> list1, Queue<Integer> list2){
            List<Integer> res = new ArrayList<>();
            while (!list1.isEmpty() || !list2.isEmpty()){
                if(list2.isEmpty() || (!list1.isEmpty() && list1.peek() <= list2.peek())){
                    res.add(list1.remove());
                }else {
                    res.add(list2.remove());
                }
            }
            return res;
        }
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            Queue<Integer> list1 = new LinkedList<>();
            Queue<Integer> list2 = new LinkedList<>();
            inorder(list1, root1);
            inorder(list2, root2);
            return merge(list1, list2);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}