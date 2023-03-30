package editor.cn;

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints1637 {
    public static void main(String[] args) {
        Solution solution = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints1637().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxWidthOfVerticalArea(int[][] points) {
            Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
            int maxWidth = 0;
            for (int i = 1; i < points.length; i++) {
                maxWidth = Math.max(maxWidth, points[i][0] - points[i - 1][0]);
            }
            return maxWidth;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}