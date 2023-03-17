package editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ProgrammableRobotLCP03 {
    public static void main(String[] args) {
        Solution solution = new ProgrammableRobotLCP03().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 利用hash存储障碍物坐标
        private final Map<Integer, Set<Integer>> map = new HashMap<>();

        private void init(int[][] obstacles) {
            for (int[] obstacle : obstacles) {
                Set<Integer> value = map.getOrDefault(obstacle[0], new HashSet<>());
                value.add(obstacle[1]);
                map.put(obstacle[0], value);
            }
        }

        public boolean robot(String command, int[][] obstacles, int x, int y) {
            init(obstacles);
            char[] cmd = command.toCharArray();
            int cur_x = 0, cur_y = 0, step = 0;
            do {
                if (cmd[step++ % cmd.length] == 'U') cur_y++;
                else cur_x++;
                if (isObstacles(cur_x, cur_y)) return false;
                if (cur_x == x && cur_y == y) return true;
            } while (cur_x <= x || cur_y <= y);
            return false;
        }

        private boolean isObstacles(int x, int y) {
            return map.containsKey(x) && map.get(x).contains(y);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}