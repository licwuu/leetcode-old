package editor.cn.solution;

class ShuZhiDeZhengShuCiFangLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZhiDeZhengShuCiFangLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double myPow(double x, int n) {
            boolean isFS = (n < 0);
            long absN = Math.abs((long) n);
            double ans = 1d;
            while(absN > 0){
                if((absN & 1) == 1) ans = isFS ? ans / x :ans * x;
                x = x * x;
                absN >>= 1;
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}