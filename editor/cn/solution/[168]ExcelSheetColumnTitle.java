package editor.cn.solution;

class ExcelSheetColumnTitle{
    public static void main(String[] args) {
        Solution solution = new ExcelSheetColumnTitle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuffer stringBuffer = new StringBuffer();
            while (columnNumber > 0){
                int val = (columnNumber - 1) % 26 + 'A';
                stringBuffer.append((char) val);
                columnNumber = (columnNumber - 1) / 26;
            }
            return stringBuffer.reverse().toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}