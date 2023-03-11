package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class NQueens{
    public static void main(String[] args) {
        Solution solution = new NQueens().new Solution();
        solution.solveNQueens(4);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        char[][] board;
        List<List<String>> ans = new ArrayList<>();

        boolean isOk(int x, int y){
            int n = board.length;
            // 列不冲突
            for (int i = 0; i < n; i++){
                if(board[i][y] == 'Q') return false;
            }
            // 行不冲突
            for (int i = y; i < n; i++){
                if(board[x][i] == 'Q') return false;
            }

            // 对角线不冲突
            for (int i = x, j = y; i < n && j < n; i++, j++) {
                    if(board[i][j] == 'Q') return false;
            }
            for (int i = x, j = y; i >= 0 && j >= 0; i--, j--) {
                if(board[i][j] == 'Q') return false;
            }
            for (int i = x, j = y; i >= 0 && j < n ; i--, j++) {
                if(board[i][j] == 'Q') return false;
            }
            for (int i = x, j = y; i < n && j >= 0 ; i++, j--) {
                if(board[i][j] == 'Q') return false;
            }

            return true;
        }

        void init(int n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }
        }
        List<String> toS(){
            List<String> list = new ArrayList<>();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    sb.append(board[i][j]);
                }
                list.add(sb.toString());
                sb.setLength(0);
            }
            return list;
        }
        void dfs(int x, int n){
            if (x == n){
                ans.add(toS());
                return;
            }
            for (int i = 0; i < n; i++){
                if(isOk(x, i)){
                    board[x][i] = 'Q';
                    dfs(x + 1, n);
                    board[x][i] = '.';
                }
            }
        }
        public List<List<String>> solveNQueens(int n) {
            board = new char[n][n];
            init(n);
            dfs(0, n);
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}