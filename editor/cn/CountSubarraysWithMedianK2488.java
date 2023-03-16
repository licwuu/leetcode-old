package editor.cn;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithMedianK2488 {
    public static void main(String[] args) {
        Solution solution = new CountSubarraysWithMedianK2488().new Solution();

        solution.countSubarrays(new int[]{3, 2, 1, 4, 5}, 4);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSubarrays(int[] nums, int k) {
            // 记录前缀和为key出现的次数
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int sum = 0, ans = 0;
            boolean flag = false;
            for (int num : nums) {
                if (num == k) flag = true;
                sum += Integer.compare(num, k);
                if (flag) {
                    ans += map.getOrDefault(sum, 0);
                    // k在之前已经出现了，多一个比k大的数，中位数也是k
                    ans += map.getOrDefault(sum - 1, 0);
                } else {
                    // k还没出现，中位数不可能是k
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}