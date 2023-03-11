package editor.cn.solution;

/**
 * 见题解中数学推导
 */
class JianShengZiIiLcof{
    public static void main(String[] args) {
        Solution solution = new JianShengZiIiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private static final int M = 1000000007;
        public int cuttingRope(int n) {
            if(n <= 3) return n - 1;
            int ys = n % 3, a = n / 3 - 1;
            long ans = fastPowerWithM(3 , a);
            return (int)(ys == 2 ? (ans * 3 * 2 % M) : (ys == 1 ? ans * 4 % M : ans * 3 % M));
        }
        int fastPowerWithM(long x, int a){
            long res = 1;
            while(a > 0){
                if((a & 1) == 1) res = res * x % M;
                x = x * x % M;
                a = a >> 1;

            }
            return (int) res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}