package editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeIntervals56 {
    public static void main(String[] args) {
        Solution solution = new MergeIntervals56().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
            List<int[]> ansList = new ArrayList<>();
            int s = intervals[0][0], t = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if(t < intervals[i][0]){
                    ansList.add(new int[]{s, t});
                    s = intervals[i][0];
                    t = intervals[i][1];
                }else {
                    t = Math.max(t, intervals[i][1]);
                }
            }
            ansList.add(new int[]{s, t});
            return ansList.toArray(new int[ansList.size()][]);
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}