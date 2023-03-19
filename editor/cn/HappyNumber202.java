package editor.cn;

import java.util.HashSet;

public class HappyNumber202 {
    public static void main(String[] args) {
        Solution solution = new HappyNumber202().new Solution();
        solution.isHappy(19);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> nums = new HashSet<>();
            while (n != 1) {
                n = transform(n);
                if (nums.contains(n)) {
                    return false;
                }
                nums.add(n);
            }
            return true;
        }

        private int transform(int n) {
            int res = 0;
            while (n > 0) {
                int digital = n % 10;
                res += digital * digital;
                n /= 10;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}