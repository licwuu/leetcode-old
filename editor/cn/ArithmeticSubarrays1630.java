package editor.cn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArithmeticSubarrays1630 {
    public static void main(String[] args) {
        Solution solution = new ArithmeticSubarrays1630().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
            LinkedList<Boolean> ans = new LinkedList<>();
            for (int i = 0; i < l.length; i++) {
                ans.addLast(isArithmetic(Arrays.copyOfRange(nums, l[i], r[i] + 1)));
            }
            return ans;
        }

        private boolean isArithmetic(int[] list) {
            if (list.length < 3) return true;
            Arrays.sort(list);
            int d = list[1] - list[0];
            for (int i = 2; i < list.length; i++) {
                if (list[i] - list[i - 1] != d) return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}