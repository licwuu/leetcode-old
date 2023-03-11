package editor.cn.solution;

class OneNzhengShuZhong1chuXianDeCiShuLcof{
    public static void main(String[] args) {
        Solution solution = new OneNzhengShuZhong1chuXianDeCiShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countDigitOne(int n) {
        int high = n , cur  = 0, low = 0, digit = 0 ,ans = 0;
        while (high > 0){
            low = cur * digit + low;
            cur = high % 10;
            high = high/10;
            digit = digit == 0 ? 1 : digit * 10;
            if(cur == 0) ans += high * digit;
            else if(cur == 1) ans += high * digit + low + 1;
            else ans += (high + 1) * digit;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}