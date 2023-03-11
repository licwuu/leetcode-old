package editor.cn.solution;

import java.util.PriorityQueue;

class ChouShuLcof{
    public static void main(String[] args) {
        Solution solution = new ChouShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int nthUglyNumber(int n) {
            //动态规划
            int[] dp = new int[n + 1];
            dp[1] = 1;
            int n1 = 1, n2 = 1, n3 = 1;
            for (int i = 2; i <= n; i++) {
                int num1 = dp[n1] * 2, num2 = dp[n2] * 3, num3 = dp[n3] * 5;
                dp[i] = Math.min(num1, Math.min(num2, num3));
                if (dp[i] == num1) n1++;
                if (dp[i] == num2) n2++;
                if (dp[i] == num3) n3++;
            }
            return dp[n];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    //小根堆实现
    class Solution2 {
        public int nthUglyNumber(int n) {
            //小根堆
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int front = 0, cur = 1;
            queue.add(1);
            for (int i = 0; i < n; i++) {
                cur = queue.remove();
                while (cur == front){
                    cur = queue.remove();
                }
                queue.add(cur > Integer.MAX_VALUE/2 ? Integer.MAX_VALUE :cur * 2);
                queue.add(cur > Integer.MAX_VALUE/3 ? Integer.MAX_VALUE :cur * 3);
                queue.add(cur > Integer.MAX_VALUE/5 ? Integer.MAX_VALUE :cur * 5);
                front = cur;
            }
            return cur;
        }
    }
}