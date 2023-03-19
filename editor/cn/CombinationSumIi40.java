package editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIi40 {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIi40().new Solution();
        solution.combinationSum2(new int[]{
                10, 1, 2, 7, 6, 1, 5
        }, 8);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private List<List<Integer>> ans = new ArrayList<>();
        private LinkedList<Integer> list = new LinkedList<>();

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            dfs(candidates, 0, target, 0);
            return ans;
        }

        private void dfs(int[] candidates, int start, int target, int sum) {
            if (sum == target) {
                ans.add(new ArrayList<>(list));
                return;
            }
            if (sum > target) return;

            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                list.addLast(candidates[i]);
                dfs(candidates, i + 1, target, sum + candidates[i]);
                list.removeLast();
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}