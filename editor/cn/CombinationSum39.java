package editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
    public static void main(String[] args) {
        Solution solution = new CombinationSum39().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private final List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            helper(new ArrayList<>(), candidates, 0, 0, target);
            return ans;
        }

        void helper(List<Integer> order, int[] candidates, int index, int sum, int target) {
            for (int i = index; i < candidates.length; i++) {
                int candidate = candidates[i];
                if (sum + candidate > target) break;
                if (sum + candidate == target) {
                    order.add(candidate);
                    ans.add(new ArrayList<>(order));
                } else if (sum + candidate < target) {
                    order.add(candidate);
                    helper(order, candidates, i, sum + candidate, target);
                }
                order.remove(order.size() - 1);
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}