package editor.cn;

public class NumberOfIslands200 {
    public static void main(String[] args) {
        Solution solution = new NumberOfIslands200().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numIslands(char[][] grid) {
            int ans = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        ans++;
                        clear(grid, i, j);
                    }
                }
            }
            return ans;
        }

        private void clear(char[][] grid, int x, int y) {
            if (grid[x][y] == '0') return;
            grid[x][y] = '0';
            if (x > 0) clear(grid, x - 1, y);
            if (y > 0) clear(grid, x, y - 1);
            if (x + 1 < grid.length) clear(grid, x + 1, y);
            if (y + 1 < grid[0].length) clear(grid, x, y + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}