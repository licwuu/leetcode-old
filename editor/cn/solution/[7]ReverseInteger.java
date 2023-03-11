package editor.cn.solution;

class ReverseInteger{
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            boolean isF = false;
            if(x < 0) {
                x = -x;
                isF = true;
            }
            int res = 0;
            while(x > 0){
                if (isF){
                   if(res >-(Integer.MIN_VALUE/10) || res == -(Integer.MIN_VALUE/10) && x % 10 > -(Integer.MIN_VALUE % 10)){
                       return 0;
                   }
                }else {
                    if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && x % 10 > Integer.MAX_VALUE % 10){
                        return 0;
                    }
                }
                res = res * 10 + x % 10;
                x /= 10;
            }
            return isF ? -res : res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}