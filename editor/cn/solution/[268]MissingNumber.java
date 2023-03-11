package editor.cn.solution;

class MissingNumber{
    public static void main(String[] args) {
        Solution solution = new MissingNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        void swap(int[] nums, int i, int j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        public int missingNumber(int[] nums) {
            int n = nums.length, ans = n;
            for (int i = 0; i < n; i++) {
                if(nums[i] == i) continue;
                while (nums[i] != i){
                    if(nums[i] == n) {
                        ans = i;
                        break;
                    }
                    swap(nums, i, nums[i]);
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}