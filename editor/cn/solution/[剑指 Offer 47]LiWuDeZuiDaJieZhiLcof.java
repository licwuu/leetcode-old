package editor.cn.solution;

class LiWuDeZuiDaJieZhiLcof{
    public static void main(String[] args) {
        Solution solution = new LiWuDeZuiDaJieZhiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxValue(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
            return 0;
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i == 0 && j == 0) dp[i][j] = grid[i][j];
                else if(j == 0) dp[i][j] = dp[i - 1][j] + grid[i][j];
                else if(i == 0) dp[i][j] = dp[i][j - 1] + grid[i][j];
                else dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[n - 1][m - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}