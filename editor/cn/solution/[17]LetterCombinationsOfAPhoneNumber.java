package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class LetterCombinationsOfAPhoneNumber{
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> ans = new ArrayList<>();
        String[] map = new String[]{
                "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        } ;
        public List<String> letterCombinations(String digits) {
            if(digits.length() == 0) return ans;
            helper(digits, new StringBuffer(), 0);
            return ans;
        }
        public void helper(String digits, StringBuffer oneRes, int pos){
            if(pos == digits.length()){
                ans.add(oneRes.toString());
                return;
            }
            int num = digits.charAt(pos) - '2';
            for (int i = 0; i < map[num].length(); i++){
                oneRes.append(map[num].charAt(i));
                helper(digits, oneRes, pos + 1);
                oneRes.deleteCharAt(pos);
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}