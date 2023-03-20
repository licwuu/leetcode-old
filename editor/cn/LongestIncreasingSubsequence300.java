package editor.cn;

import java.util.Arrays;

public class LongestIncreasingSubsequence300 {
    public static void main(String[] args) {
        Solution solution = new LongestIncreasingSubsequence300().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            Arrays.fill(dp, 1);
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }
            int res = 0;
            for (int len : dp) {
                res = Math.max(res, len);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}