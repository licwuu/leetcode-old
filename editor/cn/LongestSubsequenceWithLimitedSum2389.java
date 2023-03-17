package editor.cn;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum2389 {
    public static void main(String[] args) {
        Solution solution = new LongestSubsequenceWithLimitedSum2389().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] answerQueries(int[] nums, int[] queries) {
            Arrays.sort(nums);
            int[] ans = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                ans[i] = answer(nums, queries[i]);
            }
            return ans;
        }

        private int answer(int nums[], int query) {
            int cnt = 0, sum = 0;
            for (int num : nums) {
                sum += num;
                if (sum > query) break;
                cnt++;
            }
            return cnt;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}