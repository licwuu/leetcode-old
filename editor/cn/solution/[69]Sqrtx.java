package editor.cn.solution;

class Sqrtx{
    public static void main(String[] args) {
        Solution solution = new Sqrtx().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            if (x < 2) return x;
            long l = 1, r = x/2;
            while (l < r){
                long m = (l + r)/2;
                if(m > x/m || m * m > x){
                    r = m - 1;
                }else if(m * m < x){
                    l = m + 1;
                }else if(m * m == x){
                    return (int)m;
                }
            }
            return (int)(l * l > x ? l - 1 : l);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}