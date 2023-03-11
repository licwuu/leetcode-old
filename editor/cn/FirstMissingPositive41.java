package editor.cn;

public class FirstMissingPositive41 {
    public static void main(String[] args) {
        Solution solution = new FirstMissingPositive41().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int firstMissingPositive(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != i + 1 && inScopeN(nums[i], nums.length)) {
                    // 两个位置的值相同，不要交换，不判断会陷入死循环
                    if(nums[i] == nums[nums[i] - 1]) break;
                    swap(nums, i, nums[i] - 1);
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] - 1 != i) {
                    return i + 1;
                }
            }
            return nums.length + 1;
        }

        private boolean inScopeN(int i, int n) {
            return i > 0 && i <= n;
        }

        private void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}