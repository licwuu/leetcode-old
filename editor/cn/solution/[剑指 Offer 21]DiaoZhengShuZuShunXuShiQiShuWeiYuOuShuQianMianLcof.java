package editor.cn.solution;

class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof{
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            if(nums[start] % 2 == 0){
                while(end > start && nums[end] % 2 == 0) end--;
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
            }
            start++;
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}