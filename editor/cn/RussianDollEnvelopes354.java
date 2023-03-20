package editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RussianDollEnvelopes354 {
    public static void main(String[] args) {
        Solution solution = new RussianDollEnvelopes354().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxEnvelopes(int[][] envelopes) {
            // 宽度升序排列， 高度降序排列
            Arrays.sort(envelopes, (int[] a, int[] b) -> {
                if (a[0] != b[0]) return a[0] - b[0];
                return b[1] - a[1];
            });

            List<Integer> f = new ArrayList<>();
            f.add(envelopes[0][1]);
            for (int i = 1; i < envelopes.length; ++i) {
                int num = envelopes[i][1];
                if (num > f.get(f.size() - 1)) {
                    f.add(num);
                } else {
                    int index = binarySearch(f, num);
                    f.set(index, num);
                }
            }
            return f.size();
        }

        public int binarySearch(List<Integer> f, int target) {
            int low = 0, high = f.size() - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (f.get(mid) < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }

    }

//leetcode submit region end(Prohibit modification and deletion)

}