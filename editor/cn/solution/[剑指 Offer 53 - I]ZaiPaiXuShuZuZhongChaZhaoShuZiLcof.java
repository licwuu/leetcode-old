package editor.cn.solution;

class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int erFenSearch(int[] nums, int target){
            int l = 0, r = nums.length, m = (l + r) / 2;
            while(l < r){
                if(nums[m] == target)
                    return m;
                else if(target > nums[m]){
                    l = m + 1;
                    m = ((l + r) / 2);
                }else if(target < nums[m]){
                    r = m;
                    m = ((l + r) / 2);
                }
            }
            return -1;
        }
        public int search(int[] nums, int target) {
            int ans = 0, pos = erFenSearch(nums, target);
            if(pos >= 0){
                ans ++;
                int tmp = pos;
                while (--tmp >= 0 && nums[tmp] == target) ans++;
                tmp = pos;
                while (++tmp < nums.length && nums[tmp] == target) ans++;
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}