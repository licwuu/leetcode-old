package editor.cn;

public class CountHillsAndValleysInAnArray2210 {
    public static void main(String[] args) {
        Solution solution = new CountHillsAndValleysInAnArray2210().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countHillValley(int[] nums) {
            return findF(nums) + findG(nums);
        }

        int findG(int[] nums) {
            int res = 0;
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] == nums[i - 1]) continue;
                if (nums[i] < nums[i - 1]) {
                    while ((i < nums.length - 2) && (nums[i + 1] == nums[i])) i++;
                    if ((nums[i] < nums[i + 1])) res++;
                }
            }
            return res;
        }

        int findF(int[] nums) {
            int res = 0;
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] == nums[i - 1]) continue;
                if (nums[i] > nums[i - 1]) {
                    while ((i < nums.length - 2) && (nums[i + 1] == nums[i])) i++;
                    if ((nums[i] > nums[i + 1])) res++;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}