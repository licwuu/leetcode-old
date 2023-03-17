package problems;

public class FindTheHighestAltitude {

    class Solution {
        public int largestAltitude(int[] gain) {
            int max = 0, cur = 0;
            for (int i = 0; i < gain.length; i++) {
                cur += gain[i];
                max = max > cur ? max : cur;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new FindTheHighestAltitude().new Solution();
        int ans = solution.largestAltitude(new int[]{-5, 1, 5, 0, -7});
        System.out.println(ans);
    }
}
