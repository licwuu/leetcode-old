package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class UglyNumber{
    public static void main(String[] args) {
        Solution solution = new UglyNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isUgly(int n) {
            List<Long> uglyNums = new ArrayList<>();
            uglyNums.add(1l);
            int num2 = 0, num3 = 0, num5 = 0;
            long uglyNum = 1;
            while (uglyNum <= n){
                if(uglyNum == n) return true;
                uglyNum = Math.min(uglyNums.get(num2) * 2, Math.min(uglyNums.get(num3) * 3, uglyNums.get(num5) * 5));
                uglyNums.add(uglyNum);
                if(uglyNums.get(num2) * 2 == uglyNum) num2++;
                if(uglyNums.get(num3) * 3 == uglyNum) num3++;
                if(uglyNums.get(num5) * 5 == uglyNum) num5++;
            }
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}