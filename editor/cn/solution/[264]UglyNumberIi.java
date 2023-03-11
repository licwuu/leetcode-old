package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class UglyNumberIi{
    public static void main(String[] args) {
        Solution solution = new UglyNumberIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> uglyNums = new ArrayList<>();
        uglyNums.add(1);
        int num2Pos = 0, num3Pos = 0, num5Pos = 0;
        int num2 = 2, num3 = 3, num5 = 5;
        int uglyNum;
        for (int i = 1; i < n; i++) {
            uglyNum = Math.min(num2, Math.min(num3, num5));
            uglyNums.add(uglyNum);
            if(num2 == uglyNum) {
                num2Pos++;
                num2 = uglyNums.get(num2Pos) * 2;
            }
            if(num3 == uglyNum) {
                num3Pos++;
                num3 = uglyNums.get(num3Pos) * 3;
            }
            if(num5 == uglyNum) {
                num5Pos++;
                num5 = uglyNums.get(num5Pos) * 5;
            }
        }
        return uglyNums.get(n - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}