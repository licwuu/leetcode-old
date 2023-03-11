package editor.cn.solution;

class YuanQuanZhongZuiHouShengXiaDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new YuanQuanZhongZuiHouShengXiaDeShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lastRemaining(int n, int m) {
            int x = 0;
            for(int i = 2; i <= n; i++){
                x = (x + m) % i;
            }
            return x;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}