package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.*;

class BinaryTreePaths{
    public static void main(String[] args) {

//        Solution solution = new BinaryTreePaths().new Solution();
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
        private List<String> list;
        private List<Integer> nums;
        public List<String> binaryTreePaths(TreeNode root) {
            list = new ArrayList<>();
            nums = new ArrayList<>();
            if(root != null) getPath(root);
            return list;
        }
        public boolean isLeaf(TreeNode node){
            return node.right == null && node.left == null;
        }
        public String toS(List<Integer> nums){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(nums.get(0));
            for (int i = 1; i < nums.size(); i++) {
                stringBuilder.append("->").append(nums.get(i));
            }
            return stringBuilder.toString();
        }
        public void getPath(TreeNode node){
            nums.add(node.val);
            if(isLeaf(node)){
                list.add(toS(nums));
            }else {
                if(node.left != null) getPath(node.left);
                if(node.right != null) getPath(node.right);
            }
            nums.remove(nums.size() - 1);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}