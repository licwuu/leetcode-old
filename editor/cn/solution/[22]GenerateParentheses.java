package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class GenerateParentheses{
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> list = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        public List<String> generateParenthesis(int n) {
            stringBuffer.append('(');
            helper(1, 0, n);
            return list;
        }
        public void helper(int l, int r, int n){
            if(l == n && r == n){
                list.add(stringBuffer.toString());
            }
            if(l < n){
                stringBuffer.append('(');
                helper(l + 1, r, n);
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            if(r < l){
                stringBuffer.append(')');
                helper(l, r + 1, n);
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}