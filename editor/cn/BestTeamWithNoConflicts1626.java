package editor.cn;

import java.util.Arrays;

public class BestTeamWithNoConflicts1626 {
    public static void main(String[] args) {
        Solution solution = new BestTeamWithNoConflicts1626().new Solution();
        System.out.println(solution.bestTeamScore(new int[]{1, 3, 7, 3, 2, 4, 10, 7, 5},
                new int[]{4, 5, 2, 1, 1, 2, 4, 1, 4}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int bestTeamScore(int[] scores, int[] ages) {


            int len = scores.length;
            int[][] records = new int[len][2];
            for (int i = 0; i < len; i++) {
                records[i] = new int[]{scores[i], ages[i]};
            }
            // 排序保证前面的得分比后面的低
            Arrays.sort(records, (o1, o2) -> {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            });


            int[] dp = new int[len];
            for (int i = 0; i < len; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (records[j][1] <= records[i][1]) {
                        dp[i] = Math.max(dp[i], dp[j]);
                    }
                }
                dp[i] += records[i][0];
            }

            int ans = 0;
            for (int j : dp) {
                ans = Math.max(j, ans);
            }
            return ans;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}