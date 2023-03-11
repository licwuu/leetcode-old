package editor.cn.solution;

class BaShuZiFanYiChengZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZiFanYiChengZiFuChuanLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int translateNum(int num) {
            if(num == 0) return 1;
            return translateNumHelper(num);
        }
        public int translateNumHelper(int num){
            if(num == 0) return 0;
            if(num < 10) return 1;
            if(num < 26) return 2;
            int ans = translateNumHelper(num/10);
            if(num % 100 <26 && num % 100 >9)
                ans += translateNumHelper(num/100);
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}