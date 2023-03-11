package editor.cn.solution;

class JianShengZiLcof{
    public static void main(String[] args) {
        Solution solution = new JianShengZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    //数学方法， 同减绳子2
    class Solution {
        public int cuttingRope(int n) {
            if(n <= 3) return n - 1;
            int ys = n % 3, a = n / 3 - 1;
            long ans = fastPower(3 , a);
            return (int)(ys == 2 ? (ans * 3 * 2 ) : (ys == 1 ? ans * 4  : ans * 3 ));
        }
        int fastPower(long x, int a){
            long res = 1;
            while(a > 0){
                if((a & 1) == 1) res = res * x ;
                x = x * x ;
                a = a >> 1;

            }
            return (int) res;
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)
    //动态规划
    class Solution1 {
        public int cuttingRope(int n) {
            int[] dp = new int[n + 1];
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                for(int j = 1; j <= i/2; j++){
                    dp[i] = Math.max(dp[i], Math.max(dp[i - j],i - j) * j);
                }
            }
            return dp[n];
        }
    }
}