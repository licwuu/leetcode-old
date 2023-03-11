package editor.cn;

public class MajorityElement169 {
    public static void main(String[] args) {
        Solution solution = new MajorityElement169().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            int ans = nums[0], cnt = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == ans) cnt++;
                else if (cnt == 0) {
                    ans = nums[i];
                    cnt = 1;
                } else {
                    cnt--;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}