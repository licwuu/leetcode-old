package editor.cn.solution;

class SearchInsertPosition{
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int l = 0, r = nums.length - 1, m = 0;
            while (l <= r) {
                m = (l + r) / 2;
                if(nums[m] == target) return m;
                else if(nums[m] > target) r = m -1;
                else l = m + 1;
            }
            return l;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}