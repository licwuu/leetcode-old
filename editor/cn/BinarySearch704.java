package editor.cn;

public class BinarySearch704 {
    public static void main(String[] args) {
        Solution solution = new BinarySearch704().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (nums[m] == target) {
                    return m;
                } else if (nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}