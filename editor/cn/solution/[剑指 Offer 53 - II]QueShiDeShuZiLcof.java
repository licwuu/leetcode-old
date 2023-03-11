package editor.cn.solution;

class QueShiDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new QueShiDeShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length, m ;
        while (l < r){
            m = (l + r) / 2;
            if(nums[m] == m){
                l = m + 1;
            }else {
                r = m;
            }
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}