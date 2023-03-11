package editor.cn.solution;

import java.util.Stack;

class ZhanDeYaRuDanChuXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new ZhanDeYaRuDanChuXuLieLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int pos = 0;
            for (int i = 0; i < pushed.length; i++) {
                stack.push(pushed[i]);
                while(!stack.empty() && stack.peek() == popped[pos]){
                    stack.pop();
                    pos++;
                }
            }
            return pos == popped.length;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}