package editor.cn;

public class NextPermutation31 {
    public static void main(String[] args) {
        Solution solution = new NextPermutation31().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void nextPermutation(int[] nums) {
            if (nums.length == 1) return;
            int i, k;
            for (i = nums.length - 2; i >= 0; i--) {
                if (nums[i + 1] > nums[i]) break;
            }
            if (i == -1) {
                reverse(nums, 0, nums.length - 1);
                return;
            }
            int j = i + 1;
            for (k = nums.length - 1; k >= j; k--) {
                if (nums[k] > nums[i]) {
                    break;
                }
            }
            swap(nums, i, k);
            reverse(nums, j, nums.length - 1);

        }

        private void reverse(int nums[], int s, int t) {
            while (s < t) {
                swap(nums, s++, t--);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}