package editor.cn;

public class MaximalNetworkRank1615 {
    public static void main(String[] args) {
        Solution solution = new MaximalNetworkRank1615().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximalNetworkRank(int n, int[][] roads) {
            int[] degree = new int[n];
            int[][] net = new int[n][n];

            for (int[] road : roads) {
                degree[road[0]]++;
                degree[road[1]]++;
                net[road[0]][road[1]] = 1;
                net[road[1]][road[0]] = 1;
            }
            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    ans = Math.max(ans, degree[i] + degree[j] - net[i][j]);
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}