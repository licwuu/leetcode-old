package editor.cn;

public class FeiBoNaQiShuLieLcof{
    public static void main(String[] args) {
        Solution solution = new FeiBoNaQiShuLieLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int M = 1000000007;
        public int fib(int n) {
            int[] dp = new int[101];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2; i <= n; i++){
                dp[i] = (dp[i - 1] + dp[i - 2]) % M;
            }
            return dp[n];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}