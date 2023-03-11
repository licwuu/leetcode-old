package editor.cn.solution;

class PowerOfThree{
    public static void main(String[] args) {
        Solution solution = new PowerOfThree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfThree(int n) {
            if(n < 1) return false;
            long num = 1;
            while (num != n){
                num *= 3;
                if(num > n) return false;
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}