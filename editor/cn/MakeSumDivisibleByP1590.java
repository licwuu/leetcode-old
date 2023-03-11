package editor.cn;

import java.util.HashMap;
import java.util.Map;

public class MakeSumDivisibleByP1590 {
    public static void main(String[] args) {
        Solution solution = new MakeSumDivisibleByP1590().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubarray(int[] nums, int p) {
            Map<Integer, Integer> map = new HashMap<>();
            int s = 0;
            for(int num: nums) s = (s + num) % p;

            int target = s % p;
            int ans = nums.length;
//            System.out.println("target:" +target);
            s = 0;
            map.put(0, -1);
            for(int i = 0; i < nums.length; i++) {
                s = (s + nums[i]) % p;
                map.put(s, i);
                // find sum[i] - sum[res] = target
                Integer res = map.getOrDefault((s - target + p) % p, -nums.length);
                ans = Math.min(ans, i - res);
            }
            System.out.println(ans);
            return ans < nums.length ?  ans : -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
