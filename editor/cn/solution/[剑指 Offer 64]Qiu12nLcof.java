package editor.cn.solution;

class Qiu12nLcof{
    public static void main(String[] args) {
        Solution solution = new Qiu12nLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}