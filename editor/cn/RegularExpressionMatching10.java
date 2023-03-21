package editor.cn;

public class RegularExpressionMatching10 {
    public static void main(String[] args) {
        Solution solution = new RegularExpressionMatching10().new Solution();
        System.out.println(solution.isMatch("aab", "c*a*b"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        String s, p;

        public boolean isMatch(String s, String p) {
            this.s = s;
            this.p = p;
            return dfs(0, 0);
        }

        boolean dfs(int indexS, int indexP) {
            if (indexS == s.length()) {
                if (indexP == p.length()) return true;
                // p最后只剩下几个x*的情况
                if (indexP < p.length() - 1 && p.charAt(indexP + 1) == '*') {
                    return dfs(indexS, indexP + 2);
                }
                return false;
            }
            // S还没匹配完， P已经结束
            if (indexP == p.length()) return false;

            boolean res;
            // 当前字符后面没有*
            if (indexP == p.length() - 1 || p.charAt(indexP + 1) != '*') {
                if (isEqual(s.charAt(indexS), p.charAt(indexP))) {
                    res = dfs(indexS + 1, indexP + 1);
                } else res = false;
            }
            // 当前字符后面跟着*
            else {
                // p当前字符和s中的待匹配字符相等
                if (isEqual(s.charAt(indexS), p.charAt(indexP))) {
                    // 递归p当前字符用于匹配的情况和不用于匹配的情况
                    res = dfs(indexS + 1, indexP) || dfs(indexS, indexP + 2);
                }
                // p当前字符和s中的待匹配字符不相等
                else {
                    // 递归p当前字符不用于匹配的情况
                    res = dfs(indexS, indexP + 2);
                }
            }


            return res;
        }

        private boolean isEqual(char a, char b) {
            return a == b || b == '.';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}