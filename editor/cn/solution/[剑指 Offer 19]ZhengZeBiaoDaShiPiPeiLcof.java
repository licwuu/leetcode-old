package editor.cn.solution;

class ZhengZeBiaoDaShiPiPeiLcof{
    public static void main(String[] args) {
        Solution solution = new ZhengZeBiaoDaShiPiPeiLcof().new Solution();
        solution.isMatch("aa", "a*");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isMatch(String s, String p) {
            return dfs(s, p, s.length() - 1, p.length() - 1);
        }
        public boolean dfs(String s, String p, int sPos, int pPos){
            boolean res = false;
            if(pPos == -1 && sPos != -1) return false;
            if(sPos == -1){
                while (pPos > 0 && p.charAt(pPos) == '*') pPos -= 2;
                if(pPos == -1) return true;
                else return false;
            }
            if(charMatch(s.charAt(sPos), p.charAt(pPos))){
                res |= dfs(s, p, sPos - 1, pPos - 1);
            }else if(p.charAt(pPos) == '*'){
                if(pPos != 0 && charMatch(s.charAt(sPos), p.charAt(pPos - 1))){
                    res |= dfs(s, p, sPos - 1, pPos) | dfs(s, p, sPos - 1, pPos - 2);
                }
                res |= dfs(s, p, sPos, pPos - 2);
            }
            return res;
        }
        boolean charMatch(char s, char p){
            return p == '.' || p == s;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}