package editor.cn;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    public static void main(String[] args) {
        Solution solution = new HowManyNumbersAreSmallerThanTheCurrentNumber1365().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] cnt = new int[101];
            for (int num : nums) {
                cnt[num]++;
            }
            for (int i = 1; i < cnt.length; i++) {
                cnt[i] += cnt[i - 1];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] == 0 ? 0 : cnt[nums[i] - 1];
            }
            return nums;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}