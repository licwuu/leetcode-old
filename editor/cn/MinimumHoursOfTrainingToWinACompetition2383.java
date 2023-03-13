package editor.cn;

import java.util.Arrays;

public class MinimumHoursOfTrainingToWinACompetition2383 {
    public static void main(String[] args) {
        Solution solution = new MinimumHoursOfTrainingToWinACompetition2383()
                .new Solution();
        solution.minNumberOfHours(1, 1, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 50});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
            int ans = 0;
            int energySum = Arrays.stream(energy).sum();
            ans = Math.max(energySum - initialEnergy + 1, ans);
            System.out.println(ans);
//            Arrays.sort(experience);
            for (int exp : experience) {
                if (initialExperience <= exp) {
                    int add = exp - initialExperience + 1;
                    initialExperience += add;
                    ans += add;
                }
                initialExperience += exp;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}