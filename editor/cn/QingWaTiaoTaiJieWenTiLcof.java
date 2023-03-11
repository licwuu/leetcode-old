package com.licw.leetcode.editor.cn;

public class QingWaTiaoTaiJieWenTiLcof{
    public static void main(String[] args) {
        Solution solution = new QingWaTiaoTaiJieWenTiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private static final int M = 1000000007;
        public int numWays(int n) {
            if(n == 0) return 1;
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i < dp.length; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % M;
            }
            return dp[n];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}