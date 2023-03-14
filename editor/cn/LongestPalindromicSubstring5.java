package editor.cn;

public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring5().new Solution();
        solution.longestPalindrome("asdsadssdfsasd");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            boolean[][] dp = new boolean[s.length()][s.length()];
            int l = 0, r = 0;
            for (int i = 1; i < s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (i - j <= 2 || dp[j + 1][i - 1]) {
                            dp[j][i] = true;
                            if (i - j > r - l) {
                                r = i;
                                l = j;
                            }
                        }
                    }
                }
            }
            System.out.println(l + " " + r);
            return s.substring(l, r + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}