package editor.cn.solution;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger{
    public static void main(String[] args) {
        Solution solution = new RomanToInteger().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Map<Character, Integer> map;
        public Solution(){
            map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        }

        public int romanToInt(String s) {
            int ans = 0;
            int n = s.length();
            for (int i = 0; i < n; ++i) {
                int value = map.get(s.charAt(i));
                if (i < n - 1 && value < map.get(s.charAt(i + 1))) {
                    ans -= value;
                } else {
                    ans += value;
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}