package editor.cn.solution;

class JiQiRenDeYunDongFanWeiLcof{
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int[][] vis;
        public int movingCount(int m, int n, int k) {
            vis = new int[m][n];
            return movingCountHelper(0, 0, k);
        }
        public int movingCountHelper(int x, int y, int k){
            if(x < 0 || x >= vis.length || y < 0 || y >= vis[0].length || vis[x][y] == 1)
                return 0;
            else if(isNotSatisfaction(x, y, k)){
                vis[x][y] = 1;
                return 0;
            }
            int res = 1;
            vis[x][y] = 1;
            res += movingCountHelper(x - 1, y ,k) +
                    movingCountHelper(x + 1, y, k) +
                    movingCountHelper(x, y - 1, k) +
                    movingCountHelper(x, y + 1, k);
            return res;

        }
        public boolean isNotSatisfaction(int x, int y, int k){
            int sum = 0;
            while(x > 0){
                sum += x % 10;
                x /= 10;
            }
            while(y > 0){
                sum += y % 10;
                y /= 10;
            }
            return sum > k;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}