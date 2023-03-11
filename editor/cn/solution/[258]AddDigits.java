package editor.cn.solution;

class AddDigits{
    public static void main(String[] args) {
        Solution solution = new AddDigits().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int addDigits(int num) {
            int sum = 0;
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum < 10) return sum;
            return addDigits(sum);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}