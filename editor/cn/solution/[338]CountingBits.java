package editor.cn.solution;

class CountingBits{
    public static void main(String[] args) {
        Solution solution = new CountingBits().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] dp;
        public int[] countBits(int n) {
            dp = new int[n + 1];
            f(0, 0, 0, n);

            return dp;
        }
        public void f(int iBit, int num,int ones, int n){
            int val = 1 << iBit;
            if(num + val > n) return;
            dp[num + val] = ones + 1;
            f(iBit + 1, val + num, ones + 1, n);
            f(iBit + 1, num,ones ,n);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}