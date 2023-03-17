package problems;

import java.util.HashMap;
import java.util.Map;

public class TriplesWithBitwiseAndEqualToZero {
    class Solution {
        public int countTriplets(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    int tmp = nums[i] & nums[j];
                    if (map.containsKey(tmp)) {
                        map.put(tmp, map.get(tmp) + 1);
                    } else {
                        map.put(tmp, 1);
                    }
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                for (int i = 0; i < nums.length; i++) {
                    if ((nums[i] & entry.getKey()) == 0) {
                        ans += entry.getValue();
                    }
                }
            }


            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new TriplesWithBitwiseAndEqualToZero().new Solution();
        int ans = solution.countTriplets(new int[]{0, 0, 0});
        System.out.println(ans);
    }
}
