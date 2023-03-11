package editor.cn.solution;

import com.licw.leetcode.editor.cn.helpClass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class XuLieHuaErChaShuLcof{
    public static void main(String[] args) {

        Codec codec = new XuLieHuaErChaShuLcof().new Codec();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String ser = codec.serialize(root);
        System.out.println("序列化结果:" + ser);
        TreeNode deserialize = codec.deserialize(ser);
        ser = codec.serialize(deserialize);
        System.out.println("序列化结果:" + ser);


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
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root == null) return "_null";
            StringBuffer sb = new StringBuffer();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()){
                TreeNode tmp = q.poll();
                if(tmp == null){
                    sb.append("_null");
                }else {
                    sb.append("_");
                    sb.append(tmp.val);
                    q.add(tmp.left);
                    q.add(tmp.right);
                }
            }
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if("_null".equals(data))
                return null;
            //第一个元素为空， 后面从下标1开始
            String[] nodeS = data.split("_");
            Queue<TreeNode> q = new LinkedList<>();
            TreeNode root = new TreeNode(Integer.parseInt(nodeS[1]));
            q.add(root);
            int pos = 2;
            while (!q.isEmpty()){
                TreeNode tmp = q.poll();
                if(!"null".equals(nodeS[pos])){
                    TreeNode left = new TreeNode(Integer.parseInt(nodeS[pos]));
                    tmp.left = left;
                    q.add(left);
                }
                pos++;
                if(!"null".equals(nodeS[pos])){
                    TreeNode right = new TreeNode(Integer.parseInt(nodeS[pos]));
                    tmp.right = right;
                    q.add(right);
                }
                pos++;
            }

            return root;
        }
    }

    // Your Codec object will be instantiated and called as such:
    // Codec codec = new Codec();
    // codec.deserialize(codec.serialize(root));
    //leetcode submit region end(Prohibit modification and deletion)

}