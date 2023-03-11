package editor.cn.solution;

class MinimumPathSum{
    public static void main(String[] args) {
        Solution solution = new MinimumPathSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            int[][] dp = new int[m][n];
            dp[0][0] = grid[0][0];
            for(int i = 0; i < m; i++){
                if(i != 0) dp[i][0] = dp[i - 1][0] + grid[i][0];
                for (int j = 1; j < n; j++) {
                    if(i > 0) dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                    else dp[i][j] =  dp[i][j - 1] + grid[i][j];
                }
            }
            return dp[m - 1][n - 1];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}