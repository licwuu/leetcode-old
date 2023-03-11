package editor.cn.solution;

class LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            boolean flag = true;
            int pos = -1;
            while (flag){
                pos++;
                for (int i = 0; i < strs.length; i++) {
                    if(pos == strs[i].length()){
                        flag = false;
                        break;
                    }
                    if(i > 0 && strs[i].charAt(pos) != strs[i - 1].charAt(pos)){
                        flag = false;
                        break;
                    }
                }
            }
            return strs[0].substring(0,pos);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}