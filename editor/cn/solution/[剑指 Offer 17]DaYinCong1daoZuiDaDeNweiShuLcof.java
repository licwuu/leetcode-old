package editor.cn.solution;

import java.util.Stack;

class DaYinCong1daoZuiDaDeNweiShuLcof{
    public static void main(String[] args) {
        Solution1 solution = new DaYinCong1daoZuiDaDeNweiShuLcof().new Solution1();
        solution.printNumbers(3);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] printNumbers(int n) {
            int max = (int)Math.pow(10, n) - 1;
            int[] ans = new int[max];
            for (int i = 0; i < max; i++) {
                ans[i] = i + 1;
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    //大数方式
    class Solution1 {
        Stack<Character> cur = new Stack<>();
        public void printNumbers(int n) {
            for(int i = 1; i <= n; i++)
                dfs(0, i);
            return;
        }
        public void dfs(int x, int n){
            if(x == n){
                System.out.println(cur);
                return;
            }
            char start = (x == 0 ? '1' : '0');
            for(; start <= '9'; start++){
                cur.push(start);
                dfs(x + 1, n);
                cur.pop();
            }

        }
    }
}