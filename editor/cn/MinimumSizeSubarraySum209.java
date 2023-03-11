package editor.cn;

import java.util.HashMap;

public class MinimumSizeSubarraySum209 {
    public static void main(String[] args) {
        Solution solution = new MinimumSizeSubarraySum209().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int r = 0, l = 0, sum = 0, ans = nums. length + 10;
            while (r < nums.length){
                sum += nums[r++];
                if(sum >= target){
                    ans = Math.min(ans, r - l);
                    while (sum - nums[l] >= target){
                        sum -= nums[l++];
                        ans = Math.min(ans, r - l );
                    }
                }
            }
            return ans == nums.length + 10 ? 0 : ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}