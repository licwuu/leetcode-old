package editor.cn.solution;

class PalindromeNumber{
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            if(x < 0) return false;
            int reverseX = 0, tmp = x;
            while (tmp > 0){
                reverseX = reverseX * 10 + tmp % 10;
                tmp /= 10;
            }
//            System.out.println(x + ":" + reverseX);
            return x == reverseX;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}