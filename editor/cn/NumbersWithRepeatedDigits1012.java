package editor.cn;

public class NumbersWithRepeatedDigits1012 {
    public static void main(String[] args) {
        Solution solution = new NumbersWithRepeatedDigits1012().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int res = 0;

        public int numDupDigitsAtMostN(int n) {
            for (int i = 1; i <= 9; i++) {
                dfs(i, 1 << i, n);
            }
            return n - res;
        }

        public void dfs(long x, int mask, int n) {
            if (x > n) return;
            res++;
            x *= 10;
            for (int i = 0; i < 10; i++) {
                // 数字 i 没有出现
                if ((1 << i & mask) == 0) {
                    dfs(x + i, (1 << i) | mask, n);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}