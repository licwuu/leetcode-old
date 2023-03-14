package editor.cn;

import java.util.Arrays;

public class ThreeSumClosest16 {
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest16().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int ans = Integer.MAX_VALUE;
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == target) return sum;
                    if (Math.abs(sum - target) < Math.abs(ans - target)) {
                        ans = sum;
                    }
                    if (target < sum) r--;
                    else l++;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}