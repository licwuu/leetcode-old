package com.licw.leetcode.editor.cn;

public class JuZhenZhongDeLuJingLcof{
    public static void main(String[] args) {
        Solution solution = new JuZhenZhongDeLuJingLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int n, m;
        public boolean exist(char[][] board, String word) {
            n = board.length;
            m = board[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(existRoad(board, i, j, word.toCharArray(),0))
                        return true;
                }
            }
            return false;
        }
        public boolean existRoad(char[][] board, int i, int j, char[] word, int pos){
            boolean res = false;
            if(board[i][j] != word[pos])
                return false;

            if(word.length - 1 == pos) {
                return true;
            }

            board[i][j] = '\0';

            if(i - 1 >= 0){//上
                if(existRoad(board, i - 1, j, word, pos + 1))
                    return true;
            }
            if(i + 1 < n ) {//下
                if(existRoad(board, i + 1, j, word, pos + 1))
                    return true;
            }
            if(j - 1 >= 0){//左
                if(existRoad(board, i, j - 1, word, pos + 1))
                    return true;
            }
            if(j + 1 < m ) {//右
                if(existRoad(board, i, j  + 1, word, pos + 1))
                    return true;
            }
            board[i][j] = word[pos];
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}