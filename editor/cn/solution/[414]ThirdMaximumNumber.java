package editor.cn.solution;

class ThirdMaximumNumber{
    public static void main(String[] args) {
        Solution solution = new ThirdMaximumNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int thirdMax(int[] nums) {
            int n = nums.length;
            Integer max = nums[0], second = null, three = null;
            for (int i = 1; i < n; i++) {
                if(nums[i] > max){
                    three = second;
                    second = max;
                    max = nums[i];
                }else if(nums[i] < max && (second == null || nums[i] > second)){
                    three = second;
                    second = nums[i];
                }else if((second != null && nums[i] < second) && (three == null || nums[i] > three)){
                    three = nums[i];
                }
            }
            return three == null ? max : three;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}