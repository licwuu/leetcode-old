package editor.cn;

import java.util.Arrays;

public class MaximumSumCircularSubarray918 {
    public static void main(String[] args) {
        Solution solution = new MaximumSumCircularSubarray918()
                .new Solution();
        solution.maxSubarraySumCircular(new int[]{
                -3, -2, -3
        });
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int maxSubarraySumCircular(int[] nums) {
            int sum = Arrays.stream(nums).sum();
            int max = findMax(nums);
            int min = findMin(nums);
            return max > 0 ? Math.max(max, sum - min) : max;
        }

        int findMin(int[] nums) {
            int minSum = nums[0], sum = 0;
            for (int num : nums) {
                sum = Math.min(sum, 0) + num;
                minSum = Math.min(sum, minSum);
            }
            return minSum;
        }

        int findMax(int[] nums) {
            int maxSum = nums[0], sum = 0;
            for (int num : nums) {
                sum = Math.max(sum, 0) + num;
                maxSum = Math.max(sum, maxSum);
            }
            return maxSum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}