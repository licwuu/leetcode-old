package editor.cn;

public class MaximumSumCircularSubarray918 {
    public static void main(String[] args) {
        Solution solution = new MaximumSumCircularSubarray918()
                .new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int len = nums.length;
            // 找最小值
            int minValue = nums[0], minValueIndex = 0;
            for (int i = 1; i < len; i++) {
                if (nums[i] < minValue) {
                    minValue = nums[i];
                    minValueIndex = i;
                }
            }
            // 从最小值对应的下标开始遍历数组
            int maxSum = minValue, sum = 0;
            for (int i = minValueIndex; i < len + minValueIndex; i++) {
                sum = Math.max(sum, 0) + nums[i % len];
                maxSum = Math.max(sum, maxSum);
            }

            return maxSum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}