package editor.cn.solution;

class LianXuZiShuZuDeZuiDaHeLcof{
    public static void main(String[] args) {
        Solution solution = new LianXuZiShuZuDeZuiDaHeLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum = nums[0], ans = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum = Math.max(0, sum) + nums[i];
                ans = Math.max(ans, sum);
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}