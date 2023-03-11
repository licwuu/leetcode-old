package com.licw.leetcode.editor.cn;

public class XuanZhuanShuZuDeZuiXiaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minArray(int[] numbers) {
            int n = numbers.length, pos = 0;
            if(n == 1) return numbers[0];
            while(numbers[pos] >= numbers[(pos + n - 1) % n] && pos != 1) pos = (pos + n - 1) % n;
            return numbers[pos];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}