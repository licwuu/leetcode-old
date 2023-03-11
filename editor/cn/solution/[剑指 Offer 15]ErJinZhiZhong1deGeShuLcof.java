package editor.cn.solution;

class ErJinZhiZhong1deGeShuLcof{
    public static void main(String[] args) {
        Solution solution = new ErJinZhiZhong1deGeShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int ans = 0;
            for (int i = 0; i < 32; i++) {
                if((n & 1) == 1) ans++;
                n >>= 1;
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}