package editor.cn;

import java.util.Arrays;

public class PartitionEqualSubsetSum416 {
    public static void main(String[] args) {
        Solution solution = new PartitionEqualSubsetSum416().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPartition(int[] nums) {
            int sum = Arrays.stream(nums).sum();
            if ((sum & 1) == 1) {
                return false;
            }
            int target = sum / 2;

            boolean[][] dp = new boolean[nums.length][target + 1];
            for (int j = 0; j < nums.length; j++) {
                dp[j][0] = true;
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < target + 1; j++) {
                    if (i == 0) dp[i][j] = j == nums[i];
                    else {
                        if (j < nums[i]) dp[i][j] = dp[i - 1][j];
                        else dp[i][j] = dp[i - 1][j - nums[i]] || dp[i - 1][j];
                    }

                }
            }
            return dp[nums.length - 1][target];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}