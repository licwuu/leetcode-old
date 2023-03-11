package editor.cn;

public class MajorityElement169 {
    public static void main(String[] args) {
        Solution solution = new MajorityElement169().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //  Boyer-Moore投票算法, 上一次提交的代码结构优化
        public int majorityElement(int[] nums) {
            int ans = 0, cnt = 0;
            for (int num : nums) {
                if (cnt == 0) ans = num;
                cnt += ((ans == num) ? 1 : -1);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}