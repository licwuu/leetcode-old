package editor.cn.solution;

class GuPiaoDeZuiDaLiRunLcof{
    public static void main(String[] args) {
        Solution solution = new GuPiaoDeZuiDaLiRunLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices.length == 0)return 0;

            int minPrice = prices[0], ans = 0;
            for (int i = 1; i < prices.length; i++) {
                ans = Math.max(ans, prices[i] - minPrice);
                minPrice = Math.min(minPrice, prices[i]);
            }

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}