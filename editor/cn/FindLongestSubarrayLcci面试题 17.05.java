package editor.cn;

import java.util.Arrays;
import java.util.HashMap;

class FindLongestSubarrayLcci {
    public static void main(String[] args) {
        Solution solution = new FindLongestSubarrayLcci().new Solution();
        solution.findLongestSubarray(new String[]{
                "A","1","B","C","D","2","3","4","E","5","F","G","6","7","H","I","J","K","L","M"
        });
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findLongestSubarray(String[] array) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            int s = 0, start = 0, len = 0;
            for (int i = 0; i < array.length; i++) {
                s += isNum(array[i]) ? 1 : -1;
                if (map.containsKey(s)) {
                    Integer j = map.get(s);
                    if (i - j > len) {
                        start = j + 1;
                        len = i - j;
                    }
                } else {
                    map.put(s, i);
                }
            }
            return Arrays.copyOfRange(array, start, start + len);

        }

        private boolean isNum(String s) {
            char c = s.charAt(0);
            return c >= '0' && c <= '9';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}