package editor.cn.solution;

import java.util.Stack;

class ValidParentheses{
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            boolean ans = true;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '(' || c == '[' || c == '{'){
                    stack.push(c);
                }else if( !stack.isEmpty() && (c == ')' && stack.peek() == '('
                        || c == ']' && stack.peek() == '['
                        || c == '}' && stack.peek() == '{')){
                    stack.pop();
                }else {
                    ans = false;
                    break;
                }
            }
            if(ans && !stack.isEmpty()) ans = false;
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}