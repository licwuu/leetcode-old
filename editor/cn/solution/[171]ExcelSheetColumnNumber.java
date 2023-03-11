package editor.cn.solution;

class ExcelSheetColumnNumber{
    public static void main(String[] args) {
        Solution solution = new ExcelSheetColumnNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int titleToNumber(String columnTitle) {
            int ans = 0;
            for (int i = 0; i < columnTitle.length(); i++) {
                int val = columnTitle.charAt(i) - 'A' + 1;
                ans = ans * 26 + val;
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}