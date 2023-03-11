package editor.cn.solution;

class ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    // 摩尔投票法： 核心理念为 票数正负抵消
    class Solution {
        public int majorityElement(int[] nums) {
            int zhongshu = nums[0], votes = 0;
            for (int i = 0; i < nums.length; i++) {
                if(votes == 0) zhongshu = nums[i];
                votes += nums[i] == zhongshu ? 1 : -1;
            }
            return zhongshu;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}