package editor.cn.solution;

class BaZiFuChuanZhuanHuanChengZhengShuLcof{
    public static void main(String[] args) {
        Solution solution = new BaZiFuChuanZhuanHuanChengZhengShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int toNum(char c){
            if(c >= '0' && c <= '9') {
                return c - '0';
            }
            return -1;
        }
        public int strToInt(String str) {
            str = str.trim();
            if(str.equals("")) return 0;
            long ans = 0, flag = 1;
            char c = str.charAt(0);

            if(c == '-'){
                flag = -1;
            }else if(c  == '+'){
            }else if(toNum(c) >= 0){
                ans = toNum(c);
            }else return 0;

            for (int i = 1; i < str.length(); i++) {
                int n = toNum(str.charAt(i));
                if(n >= 0) ans = ans * 10 + flag * n;
                else break;
                if(ans > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (ans < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }

            return (int) (ans );
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}