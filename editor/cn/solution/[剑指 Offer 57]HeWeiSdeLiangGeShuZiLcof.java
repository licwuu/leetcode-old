package editor.cn.solution;

class HeWeiSdeLiangGeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new HeWeiSdeLiangGeShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r= nums.length - 1;
        while (l < r){
            if(nums[l] + nums[r] == target){
                return new int[]{nums[l], nums[r]};
            }else if(nums[l] + nums[r] < target) l++;
            else r--;
        }
        return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}