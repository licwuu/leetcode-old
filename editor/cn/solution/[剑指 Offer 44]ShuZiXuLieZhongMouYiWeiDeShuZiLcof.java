package editor.cn.solution;

class ShuZiXuLieZhongMouYiWeiDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZiXuLieZhongMouYiWeiDeShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNthDigit(int n) {
        long digit = 1, start = 1, count = 9;
        while(n > count){
            n -= count;
            digit++;
            start *= 10;
            count = 9 * digit * start;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((int) ((n - 1) % digit)) - '0';

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}